name := """playing-with-mustache"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scala-lang" % "scala-compiler" % scalaVersion.value,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.github.tototoshi" %% "play-scalate" % "0.3.0",
  "org.scalatra.scalate" %% "scalate-core" % "1.8.0"
)

unmanagedResourceDirectories in Compile += baseDirectory.value / "app" / "views"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
