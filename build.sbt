import Dependencies._

ThisBuild / organization := "com.codecommit"

ThisBuild / baseVersion  := "0.1"

ThisBuild / publishGithubUser := "djspiewak"
ThisBuild / publishFullName   := "Daniel Spiewak"
ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "example-plugin-overrides",
    libraryDependencies += munit % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
