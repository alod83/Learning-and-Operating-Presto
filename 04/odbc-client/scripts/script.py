import pyodbc

conn=pyodbc.connect("DRIVER=CData ODBC Driver for Presto;server=presto-coordinator;Port=8080;user=client;catalog=tpch;schema=tiny")

cur = conn.cursor()
cur.execute('SELECT * FROM customer LIMIT 5')
rows = cur.fetchall()

print(rows)