FROM ubuntu:22.04

ENV SPARK_VERSION=3.2.3

RUN apt-get update && \
    apt-get install -y openjdk-8-jdk wget

RUN wget http://dlcdn.apache.org/spark/spark-${SPARK_VERSION}/spark-${SPARK_VERSION}-bin-hadoop3.2.tgz
RUN wget https://repo1.maven.org/maven2/org/apache/hadoop/hadoop-aws/3.3.1/hadoop-aws-3.3.1.jar
RUN wget https://repo1.maven.org/maven2/com/amazonaws/aws-java-sdk-bundle/1.11.901/aws-java-sdk-bundle-1.11.901.jar

# COPY spark-3.2.2-bin-hadoop3.2.tgz /

RUN tar -xzf spark-${SPARK_VERSION}-bin-hadoop3.2.tgz && \
    mv hadoop-aws-3.3.1.jar /spark-${SPARK_VERSION}-bin-hadoop3.2/jars/ && \
    mv aws-java-sdk-bundle-1.11.901.jar /spark-${SPARK_VERSION}-bin-hadoop3.2/jars/

# Jars for s3 usage in spark-shell
#COPY hadoop-aws-3.3.1.jar /spark-3.2.1-bin-hadoop3.2/jars/
# COPY aws-java-sdk-bundle-1.11.901.jar /spark-3.2.1-bin-hadoop3.2/jars/

ENV PATH="${PATH}:/spark-${SPARK_VERSION}-bin-hadoop3.2/bin:/spark-${SPARK_VERSION}-bin-hadoop3.2/sbin"
ENV SPARK_NO_DAEMONIZE=true