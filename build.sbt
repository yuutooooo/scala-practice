// build.sbt
ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "study",
    scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")
  )