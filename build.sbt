name := "ScalaSprayTutorial"

version := "1.0"

scalaVersion := "2.11.4"

resolvers ++= Seq(
  "Spray repository" at "http://repo.spray.io",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)


libraryDependencies ++= {
  val akkaV  = "2.3.6"
  val sprayV = "1.3.2"
  val slickV = "2.1.0"
  Seq(
    "io.spray"            %%  "spray-can"             % sprayV,
    "io.spray"            %%  "spray-routing"         % sprayV,
    "io.spray"            %%  "spray-testkit"         % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"            % akkaV,
    "com.typesafe.akka"   %%  "akka-slf4j"            % akkaV,
    "org.scalatest"       %%  "scalatest"             % "2.2.2",
    "com.typesafe.akka"   %%  "akka-testkit"          % akkaV   % "test",
//    "io.spray"            %%  "spray-json"            % sprayV,
    "org.json4s"          %%  "json4s-jackson"        % "3.2.10",
    "mysql"               %   "mysql-connector-java"  % "5.1.34",
    "ch.qos.logback"      %   "logback-classic"       % "1.1.2"
  )
}