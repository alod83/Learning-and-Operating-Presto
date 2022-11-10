FROM r-base
RUN apt-get update && \
apt install -y build-essential libcurl4-gnutls-dev libxml2-dev libssl-dev
RUN R -e "install.packages('RPresto')"