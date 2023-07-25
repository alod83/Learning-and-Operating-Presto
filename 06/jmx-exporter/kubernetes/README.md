## Presto on Kubernetes

## Prerequisites
* Build the Presto Docker image contained in the directory 02/presto-docker
* In `mysql-pv.yaml` set the absolute path to mysql storage in your local filesystem

## Build cluster

```
./deploy.sh -d
```

## Remove cluster

```
./deploy.sh -r
```

## Remove and Build cluster

```
./deploy.sh -b
```
