name := "scalasample"

version := "0.1"

scalaVersion := "2.12.3"
// Add dependency on ScalaFX library
libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "8.0.102-R11",
  "org.scalafx" %% "scalafxml-core-sfx8" % "0.4",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0"
)

resolvers += Resolver.sonatypeRepo("releases")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
