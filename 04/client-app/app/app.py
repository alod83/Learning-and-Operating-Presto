import streamlit as st
import prestodb

import pandas as pd
import altair as alt

# Connection to Presto
conn=prestodb.dbapi.connect(
    host='presto-coordinator',
    port=8080,
    user='client',
    catalog='tpch',
    schema='tiny'
)

cur = conn.cursor()

st.title('Summary Report')
st.text('The number of ordered items by ship date')

# Query
query = """SELECT 
            count(*) as nitems, 
            shipdate
        FROM
            lineitem
        GROUP BY shipdate
        ORDER BY shipdate ASC
        """

cur.execute(query)

df = pd.DataFrame(cur.fetchall(), columns=['nitems', 'shipdate'])

# manipulate df
df['shipdate'] = pd.to_datetime(df['shipdate'])
df['dayofweek'] = df['shipdate'].dt.day_name()
df['year'] = df['shipdate'].dt.year
df['month'] = df['shipdate'].dt.month_name()
df['weekofyear'] = df['shipdate'].dt.isocalendar().week

# chart 1
df_1992 = df[df['year'] == 1992 ]
bar = alt.Chart(df_1992).mark_line().encode(
    x = alt.X('dayofweek:O', sort=['Sunday','Monday', 'Tuesday', 'Wednesday', 'Thursday','Friday', 'Saturday'],title=''),
    y = alt.Y('nitems:Q', title='nitems'),
    color = alt.Color('weekofyear:N',scale=alt.Scale(range=['#C8C8C8']),legend=None)
)

mean = alt.Chart(df_1992).mark_line(color='black').encode(
    x = alt.X('dayofweek:O', sort=['Sunday','Monday', 'Tuesday', 'Wednesday', 'Thursday','Friday', 'Saturday'],title=''),
    y = alt.Y('weekly_count:Q', title=''),
).transform_aggregate(
    weekly_count = 'mean(nitems)',
    groupby=['dayofweek']
)
chart1 = (bar + mean).properties(
    width=300,
    height=300,
    title='Number of shipped items in 1992'))

# chart2
chart2 = alt.Chart(df).mark_rect().encode(
    x = alt.X('year:O'),
    y = alt.Y('month:O',sort=['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']),
    color = alt.Color('nitems:Q',scale=alt.Scale(range=['#F5F5F5','#000000']))
).properties(
    width=300,
    height=300
)


# layout
col1, col2 = st.columns(2)

with col1:
    st.altair_chart(chart1)


with col2:
    st.altair_chart(chart2)




