# Presto ODBC Client

Follow these steps to run your ODBC Client in your Presto cluster.

## Presto cluster

Install the Presto cluster in your local machine (available in directories 03 and 02 of this repository)

# Download the Presto ODBC driver

Download the Unix version of the Presto driver for example from [CData](https://www.cdata.com/drivers/presto/odbc/) and put in the root directory of the project.

# Modify the input.txt file

Add your name and email to the input.txt file. Leave the empty line as is.

# Add the ODBC client to the cluster

1. Build the Docker image from this directory: 

`docker build -t python-presto .`

If you use MacOS with M1 as host, run the following command:

`docker build --platform linux/x86_64 -t odbc-presto`

2. Build the Kubernetes pod: 

`kubectl apply -f odbc-client.yaml --namespace presto`

# Test your ODBC app

3. Retrieve the pod name by running the following command: 

`kubectl get pods --namespace presto`

4. Login to your odbc-client pod: 

`kubectl exec -it odbc-client-796c5c7d59-g7csf /bin/bash --namespace presto`

5. Replace `796c5c7d59-g7csf` with the id of your pod

6. Activate your ODBC license

```
cd /opt/cdata/cdata-odbc-driver-for-presto/bin/
./install-license.sh
```

7. Move to the code directory 

`cd /home`

8. Run 

`python3 script.py` 
