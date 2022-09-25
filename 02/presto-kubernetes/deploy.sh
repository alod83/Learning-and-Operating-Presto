#!/bin/sh

function show_help(){
    echo "-d deploy cluster
    -r remove cluster
    -b delete cluster and then deploy cluster"; 
    exit 1; 

}

function remove_cluster() {
    kubectl delete configmap presto-config --namespace presto 
    kubectl delete replicationcontroller presto-worker --namespace presto
    kubectl delete replicationcontroller presto-coordinator --namespace presto
    kubectl delete service presto-coordinator --namespace presto
    kubectl delete deployment,svc mysql --namespace presto
    kubectl delete secret mysql-secrets --namespace presto
    kubectl delete secret presto-mysql-secrets --namespace presto

    kubectl patch pvc mysql-pv-claim -p '{"metadata":{"finalizers":null}}' --namespace presto
    kubectl delete pvc mysql-pv-claim --namespace presto
    kubectl delete pv mysql-pv-volume --namespace presto
    kubectl delete namespace presto
    
}

function deploy_cluster(){
    kubectl create namespace presto
    kubectl create -f mysql-secrets.yaml --namespace presto
    kubectl apply -f mysql-pv.yaml --namespace presto
    kubectl apply -f mysql-deployment.yaml --namespace presto

    kubectl create -f presto-secrets.yaml --namespace presto
    kubectl apply -f presto-config-map.yaml --namespace presto 
    kubectl apply -f presto-coordinator.yaml --namespace presto 
    kubectl apply -f presto-workers.yaml --namespace presto 
    
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