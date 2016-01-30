name := "logsense"
scalaVersion := "2.11.7"

val slf4j = Seq(
  "slf4j-api",
  "log4j-over-slf4j",
  "jcl-over-slf4j",
  "jul-to-slf4j"
) map (m => "org.slf4j" % m % "1.7.14")

libraryDependencies ++= Seq(
  "com.lihaoyi"                %% "pprint"          % "0.3.7",
  "com.lihaoyi"                %% "sourcecode"      % "0.1.0",
  "com.typesafe.scala-logging" %% "scala-logging"   % "3.1.0",
  "ch.qos.logback"             %  "logback-classic" % "1.0.13",
  "com.typesafe.akka"          %% "akka-actor"      % "2.4.1",
  "org.spire-math"             %% "cats"            % "0.3.0"
) ++ slf4j

