FROM   amd64/centos:7

WORKDIR ranger
RUN yum -y install git
RUN git clone https://github.com/apache/ranger.git
RUN export ENABLED_RANGER_SERVICES="tagsync,hadoop,hbase,kafka,hive,knox,kms"
RUN cd ranger && ./ranger_in_docker up