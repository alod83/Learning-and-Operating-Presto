# How to Export the TPCH Dataset

* Enter the Presto Coordinator and install `tar`:

`yum install tar`

* Then, run the following command:

`presto-cli --execute "SELECT * FROM tpch.sf1.customer;" --output-format CSV_HEADER > customer.csv`

* Exit from the coordinator. In a terminal, retrieve the coordinator id, by running the following command:

`kubectl get pods -n presto`

* Copy the dataset `customer.csv` from the coordinator to the host:

`kubectl cp presto-coordinator-<id>:/opt/presto-server/customer.csv ./customer.csv`

