name := "Kafka-prod-con"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.kafka" %% "kafka" % "2.1.0"

libraryDependencies +="com.typesafe" % "config" % "1.3.2"

libraryDependencies +="org.slf4j" % "slf4j-api" % "1.7.5"
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.5"