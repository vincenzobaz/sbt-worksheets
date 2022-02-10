ThisBuild / scalaVersion := "2.12.15"

publish / skip := true

lazy val plugin = project
  .enablePlugins(SbtPlugin)
  .settings(
    moduleName := "sbt-worksheets",
    addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.0")
  )