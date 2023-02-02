FROM openjdk:8u332-jre

WORKDIR /opt

ENV HADOOP_VERSION=3.2.0
ENV HIVE_VERSION=3.1.3

ENV HADOOP_HOME=/opt/hadoop-${HADOOP_VERSION}
ENV HIVE_HOME=/opt/apache-hive-${HIVE_VERSION}-bin

# https://dlcdn.apache.org/hive/hive-3.1.3/apache-hive-3.1.3-bin.tar.gz

RUN curl -L https://dlcdn.apache.org/hive/hive-${HIVE_VERSION}/apache-hive-${HIVE_VERSION}-bin.tar.gz | tar zxf -
RUN curl -L https://archive.apache.org/dist/hadoop/common/hadoop-${HADOOP_VERSION}/hadoop-${HADOOP_VERSION}.tar.gz | tar zxf -
RUN curl -L https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-java-8.0.19.tar.gz | tar zxf - && \
    cp mysql-connector-java-8.0.19/mysql-connector-java-8.0.19.jar ${HIVE_HOME}/lib/ && \
    rm -rf  mysql-connector-java-8.0.19

COPY conf/hive-site.xml ${HIVE_HOME}/conf

# RUN groupadd -r hive --gid=1000 && \
#     useradd -r -g hive --uid=1000 -d ${HIVE_HOME} hive && \
#     chown hive:hive -R ${HIVE_HOME} && \

# USER hive
EXPOSE 9083

ENV HADOOP_HOME=/opt/hadoop-${HADOOP_VERSION}
ENV HADOOP_CLASSPATH=${HADOOP_HOME}/share/hadoop/tools/lib/aws-java-sdk-bundle-1.11.375.jar:${HADOOP_HOME}/share/hadoop/tools/lib/hadoop-aws-3.2.0.jar
ENV JAVA_HOME=/usr/local/openjdk-8
ENV HIVE_HOME=/opt/apache-hive-${HIVE_VERSION}-bin

#CMD ["sleep 5; ${HIVE_HOME}/bin/schematool -initSchema -dbType mysql; ${HIVE_HOME}/bin/hive --service metastore"]
