import prestodb
conn=prestodb.dbapi.connect(
    host='presto-coordinator',
    port=8080,
    user='client',
    catalog='tpch',
    schema='sf1',
)

cur = conn.cursor()
cur.execute('SELECT * FROM customer LIMIT 5')
rows = cur.fetchall()

print(rows)