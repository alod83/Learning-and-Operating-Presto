# Presto R Client

Follow these steps to run your R Client in your Presto cluster.

## Presto cluster

Install the Presto cluster in your local machine (available in directories 03 and 02 of this repository)

# Add the R client to the cluster

1. Build the Docker image from this directory: 

`docker build -t r-presto .`

2. Build the Kubernetes pod: 

`kubectl apply -f r-client.yaml --namespace presto`

# Test your R app

3. Retrieve the pod name by running the following command: 

`kubectl get pods --namespace presto`

4. Login to your python-client pod: 

`kubectl exec -it r-client-796c5c7d59-g7csf /bin/bash --namespace presto`

5. Replace `796c5c7d59-g7csf` with the id of your pod

6. Move to the code directory 

`cd /home/docker`

7. Run 

`Rscript script.R` 
