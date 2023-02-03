// spark-shell
import org.apache.hudi.QuickstartUtils._
import scala.collection.JavaConversions._
import org.apache.spark.sql.SaveMode._
import org.apache.hudi.DataSourceReadOptions._
import org.apache.hudi.DataSourceWriteOptions._
import org.apache.hudi.config.HoodieWriteConfig._
import org.apache.spark.sql.functions.monotonicallyIncreasingId


val tableName = "customers"
val basePath = "s3a://warehouse/tables/customers"

val df = spark.read.options(Map("header" -> "true")).csv("s3a://warehouse/data/customers.csv")

val df2 = df.withColumn("uuid", monotonicallyIncreasingId)
df2.write.format("hudi").
    options(getQuickstartWriteConfigs).
    option(RECORDKEY_FIELD_OPT_KEY, "id").
    option(PRECOMBINE_FIELD_OPT_KEY, "dob").
    option(TABLE_NAME, tableName).
    option(TABLE_TYPE, "COPY_ON_WRITE").
    option(OPERATION, "upsert").
    mode(Overwrite).
    saveAsTable("hudi_customers2")

spark.sql("select * from hudi_customers where first == \"Sharon\"").show


System.exit(0)