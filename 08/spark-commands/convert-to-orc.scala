import org.apache.hudi.QuickstartUtils._
import scala.collection.JavaConversions._
import org.apache.spark.sql.SaveMode._


val tableName = "customer"
val basePath = "s3a://warehouse/tables/customer"

val df = spark.read.options(Map("header" -> "true")).csv("s3a://warehouse/tpch/customer.csv")

val df2 = df.withColumn("uuid", monotonicallyIncreasingId)
df.write.format("orc").
    options(getQuickstartWriteConfigs).
    option(RECORDKEY_FIELD_OPT_KEY, "id").
    option(PRECOMBINE_FIELD_OPT_KEY, "dob").
    option(TABLE_NAME, tableName).
    mode(Overwrite).
    saveAsTable("orc_customer")

spark.sql("select * from orc_customer limit 1").show


System.exit(0)
