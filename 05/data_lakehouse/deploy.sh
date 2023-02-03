#!/bin/sh

function show_help(){
    echo "-d deploy cluster
    -r remove cluster
    -b delete cluster and then deploy cluster"; 
    exit 1; 

}

function remove_cluster() {
    kubectl delete rc minio --namespace presto 
    kubectl delete rc mc --namespace presto 
    kubectl delete svc minio --namespace presto
    kubectl delete secret minio-secrets --namespace presto
    kubectl delete rc spark-master --namespace presto 
    kubectl delete svc spark-master --namespace presto 
    kubectl delete rc,svc hive-metastore --namespace presto 
    kubectl delete deployment,svc mysql-metastore --namespace presto 
    kubectl delete rc,svc presto-coordinator --namespace presto 
    
}

function deploy_cluster(){
    kubectl create -f minio-secrets.yaml --namespace presto
    kubectl apply -f minio.yaml --namespace presto 
    kubectl apply -f mysql-metastore.yaml --namespace presto
    sleep 10
    kubectl apply -f spark.yaml --namespace presto 
    kubectl apply -f hive-metastore.yaml --namespace presto
    kubectl apply -f presto-coordinator.yaml --namespace presto 
}

# selecting mode
while getopts "h?rdb" opt; do
  case "$opt" in
    h|\?)
      show_help
      exit 0
      ;;
    d) deploy_cluster
      ;;
    r) remove_cluster
      ;;
    b) remove_cluster
       deploy_cluster
      ;;
  esac
done

kubectl get pods -n presto