name := "scalaz-practice"

version := "1.0"

scalaVersion := "2.11.7"

val scalazVersion = "7.2.1"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.specs2"           %% "specs2"               % "2.4.1"    % "test",
  "ch.qos.logback"       %  "logback-classic"      % "1.1.2")

scalacOptions += "-feature"

initialCommands in console := "import scalaz._, Scalaz._"