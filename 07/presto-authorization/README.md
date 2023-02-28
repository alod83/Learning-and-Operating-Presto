## Presto on Kubernetes

## Generate certificates 

```
cd certificates
./generate_certificates.sh
```

## Build the Presto Docker image

```
docker build --build-arg PRESTO_VERSION=0.276.1 . -t prestodb:secure
```

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
