/**
  * Created by abgoswam on 12/5/16.
  */

/* SimpleApp.scala */
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
//import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "/usr/local/spark/spark-2.0.1-bin-hadoop2.7/README.md" // Should be some file on your system

//    val spark: SparkSession = SparkSession.builder
//      .appName("My Spark Application")  // optional and will be autogenerated if not specified
//      .master("local[*]")               // avoid hardcoding the deployment environment
//      .enableHiveSupport()              // self-explanatory, isn't it?
//      .config("spark.sql.warehouse.dir", "target/spark-warehouse")
//      .getOrCreate

    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)


    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    // sc.stop()

    println(logData.count())
    Thread.sleep(1000 * 60)
  }
}
