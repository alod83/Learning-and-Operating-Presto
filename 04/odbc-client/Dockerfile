FROM ubuntu:20.04
WORKDIR /client

RUN apt-get update && apt-get install -y python3.8 && apt-get install -y python3-pip &&\
    pip3 install --upgrade pip && apt-get install -y build-essential &&\
    apt-get install python3.8 && apt-get install python3-pip &&\
    apt-get install python3.8-dev && pip3 install --upgrade pip &&\
    apt-get install -y libc6 libstdc++6 zlib1g libgcc1 &&\
    apt-get install -y unixodbc unixodbc-dev tdsodbc

COPY PrestoODBCDriverforUnix.deb .
RUN dpkg -i PrestoODBCDriverforUnix.deb


RUN pip install pyodbc

RUN apt-get -y -q clean && apt-get -y -q autoremove && apt-get -y -q autoclean