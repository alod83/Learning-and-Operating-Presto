# Presto on Docker

This folder contains a **Dockerfile** of [Presto]

## Building the image

```
docker build --build-arg PRESTO_VERSION=0.276.1 . -t prestodb:latest
```

## Running the container

```
docker run --name presto prestodb:latest
```
