name := "meetime-service"
ThisBuild / scalaVersion := "2.13.13"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean, JavaAppPackaging)
  .settings(
    name := """meetime-service""",
    libraryDependencies ++= Seq(
      guice,
      javaJdbc,
      evolutions,
      filters,
      "org.postgresql" % "postgresql" % "42.7.3",
      "io.ebean" % "ebean-agent" % "15.1.0",
    )
  )

dependencyOverrides += "io.ebean" % "ebean" % "12.8.1"