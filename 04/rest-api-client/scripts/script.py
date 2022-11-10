import requests
import time

url = "http://presto-coordinator:8080/v1/statement"

headers = { 
    "X-Presto-User" : "client", \
    "X-Presto-Catalog": "tpch", \
    "X-Presto-Schema": "sf1"
    }

sql = "SELECT * FROM customer LIMIT 5"

resp = requests.post(url, headers=headers, data=sql)
json_resp = resp.json()

while 'nextUri' in json_resp:
    time.sleep(1)
    new_url = json_resp['nextUri']
    resp = requests.get(new_url)
    json_resp = resp.json()


# data is available
data = json_resp['data']
for i in range(0, len(data)):
    print(data[i])