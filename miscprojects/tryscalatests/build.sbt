name := "tryscalatests"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
//libraryDependencies += "junit" % "junit" % "4.10" % "test"
    