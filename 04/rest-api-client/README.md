# Presto REST API Client

Follow these steps to run your REST API Client in your Presto cluster.

## Presto cluster

Install the Presto cluster in your local machine (available in directories 03 and 02 of this repository)

# Add the REST API client to the cluster

1. Build the Docker image from this directory: 

`docker build -t rest-api-presto .`

2. Build the Kubernetes pod: 

`kubectl apply -f rest-api-client.yaml --namespace presto`

# Test your REST API app

3. Retrieve the pod name by running the following command: 

`kubectl get pods --namespace presto`

4. Login to your python-client pod: 

`kubectl exec -it rest-api-client-796c5c7d59-g7csf /bin/bash --namespace presto`

5. Replace `796c5c7d59-g7csf` with the id of your pod

6. Move to the code directory 

`cd /home`

7. Run 

`python script.py` 
