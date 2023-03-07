import sbt.internal.librarymanagement.mavenint.PomExtraDependencyAttributes

// ThisBuild / dependencyOverrides ++= Seq(
//   ("org.xerial.sbt" % "sbt-sonatype" % "3.9.17").extra(
//         PomExtraDependencyAttributes.SbtVersionKey -> (update / scalaBinaryVersion).value,
//         PomExtraDependencyAttributes.ScalaVersionKey -> sbtVersion.value
//   )
// )

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.17")

addSbtPlugin("com.codecommit" % "sbt-spiewak" % "0.23.0" exclude("org.xerial.sbt", "sbt-sonatype"))

addSbtPlugin("com.codecommit" % "sbt-spiewak-sonatype" % "0.23.0" exclude("org.xerial.sbt", "sbt-sonatype"))
