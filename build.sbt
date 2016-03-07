name := "scalaz-practice"

version := "1.0"

scalaVersion := "2.11.7"

val scalazVersion = "7.2.1"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion
)

scalacOptions += "-feature"

initialCommands in console := "import scalaz._, Scalaz._"