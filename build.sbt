ThisBuild / scalaVersion := "2.12.15"

publish / skip := true

lazy val plugin = project
  .enablePlugins(SbtPlugin)
  .settings(
    moduleName := "sbt-worksheets",
    addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.0")
  ).settings(publishSettings)

import xerial.sbt.Sonatype._
lazy val publishSettings = Def.settings(
  name := "sbt-worksheets",
  organization := "io.github.vincenzobaz",
  homepage := Some(url("https://github.com/vincenzobaz/sbt-worksheets")),
  sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
  sonatypeCredentialHost := "s01.oss.sonatype.org",
  developers := List(
    Developer(
      "vincenzobaz",
      "Vincenzo Bazzucchi",
      "bazzucchi.vincenzo@gmail.com",
      url("https://github.com/vincenzobaz/")
    )
  ),
)
