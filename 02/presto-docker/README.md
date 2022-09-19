# presto-docker

This folder contains a **Dockerfile** of [Presto]

## Installation

Pull the image from the Docker repository.
```
docker pull ahanaio/presto-getting-started:latest
```

## Build
```
docker build --rm -t ahanaio/presto-getting-started:latest .
```

## Usage

### To start a single node Presto cluster
```
docker run -it -name prestodb -p 8080:8080 ahanaio/presto-getting-started:latest
```

### To start a single node Presto cluster in a  docker network called presto
```
docker network create presto
docker run -it -name prestodb -p 8080:8080 --network presto ahanaio/presto-getting-started:latest
```

## Configuration

Configuration is handled by setting the environment variables which are set with defaults in the entrypoint.sh file.

You can override these values using the -e option for docker or updating the entrypoint.sh file
                                                                                      |

Example:
```
docker run -e PRESTO_CATALOG_HIVE=true -it ahanaio/presto-getting-started:latest
```

