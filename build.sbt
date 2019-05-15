name := "test_tapir_swagger_annotations"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % Test
libraryDependencies += "com.softwaremill.tapir" %% "tapir-core" % "0.7.9" % Test
libraryDependencies += "io.circe" %% "circe-core" % "0.10.0" % Test
libraryDependencies += "io.circe" %% "circe-generic" % "0.10.0" % Test
libraryDependencies += "io.swagger" % "swagger-annotations" % "1.5.22" % Test
