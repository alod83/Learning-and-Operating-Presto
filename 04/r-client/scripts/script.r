library(RPresto)
library(DBI)

con <- DBI::dbConnect(
  drv = RPresto::Presto(),
  host = "presto-coordinator",
  port = 8080,
  user = "r-client",
  catalog = "tpch",
  schema = "sf1"
)

 DBI::dbGetQuery(con, "SELECT * FROM customer LIMIT 5")