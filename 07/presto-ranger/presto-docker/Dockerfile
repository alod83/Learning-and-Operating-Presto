FROM   amd64/centos:7

# Presto version will be passed in at build time
ARG PRESTO_VERSION
ARG PRESTO_BIN=https://repo1.maven.org/maven2/com/facebook/presto/presto-server/${PRESTO_VERSION}/presto-server-${PRESTO_VERSION}.tar.gz

##Update OS and Dependencies##
#USER root
RUN yum update -y &&\
    yum install -y wget ca-certificates tar less\
    yum install -y java-1.8.0-openjdk\
    yum install -y java-1.8.0-opejdk-devel\
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
RUN mkdir /opt/presto/conf

# Set Java home
ENV JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.362.b08-1.el7_9.x86_64/jre

# Install Ranger Plugin
ENV RANGER_VERSION=1.2.0-SNAPSHOT
#RUN wget --quiet https://dist.apache.org/repos/dist/release/ranger/2.3.0/apache-ranger-2.3.0.tar.gz
COPY ranger-2.1.0-presto-plugin.tar.gz /opt
RUN tar -xf /opt/ranger-2.1.0-presto-plugin.tar.gz -C /opt
RUN rm /opt/ranger-2.1.0-presto-plugin.tar.gz
RUN cd /usr/local && ln -s /opt/ranger-2.1.0-presto-plugin /usr/local/ranger-presto-plugin
COPY scripts/install.properties /usr/local/ranger-presto-plugin/
RUN cd /usr/local/ranger-presto-plugin && ./enable-presto-plugin.sh

# Specify the entrypoint to start
CMD ["/opt/presto/bin/launcher", "run"]