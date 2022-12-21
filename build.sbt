lazy val akkaHttpVersion = "10.4.0"
lazy val akkaVersion    = "2.7.0"

fork := true

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    inThisBuild(List(
      organization    := "com.ibm.cloud.codeengine.test",
      scalaVersion    := "2.13.10"
    )),
    name := "java-sbt-akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"                % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json"     % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
      "com.typesafe.akka" %% "akka-stream"              % akkaVersion,
      "ch.qos.logback"    % "logback-classic"           % "1.2.11",
    )
  )
