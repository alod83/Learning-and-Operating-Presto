## Presto on Kubernetes

## Generate certificates 

```
cd certificates
./generate_certificates.sh
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
