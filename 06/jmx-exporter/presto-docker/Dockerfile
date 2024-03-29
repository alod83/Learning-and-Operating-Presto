FROM   amd64/centos:7

# Presto version will be passed in at build time
ARG PRESTO_VERSION
ARG PRESTO_BIN=https://repo1.maven.org/maven2/com/facebook/presto/presto-server/${PRESTO_VERSION}/presto-server-${PRESTO_VERSION}.tar.gz

##Update OS and Dependencies##
#USER root
RUN yum update -y &&\
    yum install -y wget ca-certificates tar less\
    yum install -y java-1.8.0-openjdk\
    yum clean all

RUN wget --quiet ${PRESTO_BIN}
RUN mkdir -p /opt
RUN tar -xf presto-server-${PRESTO_VERSION}.tar.gz -C /opt
RUN rm presto-server-${PRESTO_VERSION}.tar.gz
RUN ln -s /opt/presto-server-${PRESTO_VERSION} /opt/presto


# Copy configuration files on the host into the image
COPY etc /opt/presto/etc

ARG PRESTO_CLI_BIN=https://repo1.maven.org/maven2/com/facebook/presto/presto-cli/${PRESTO_VERSION}/presto-cli-${PRESTO_VERSION}-executable.jar
RUN wget --quiet "${PRESTO_CLI_BIN}"
RUN mv presto-cli-${PRESTO_VERSION}-executable.jar /usr/local/bin/presto
RUN chmod +x /usr/local/bin/presto
RUN mkdir /opt/presto/data
RUN mkdir /opt/presto/log

# Configuring Prometheus
RUN mkdir -p /opt/presto/etc/catalog
RUN wget --quiet https://repo1.maven.org/maven2/io/prometheus/jmx/jmx_prometheus_javaagent/0.19.0/jmx_prometheus_javaagent-0.19.0.jar
RUN mv jmx_prometheus_javaagent-0.19.0.jar /opt/presto/etc/catalog/jmx_prometheus_javaagent.jar
RUN chmod 644 /opt/presto/etc/catalog/jmx_prometheus_javaagent.jar

# Specify the entrypoint to start
CMD ["/opt/presto/bin/launcher", "run"]