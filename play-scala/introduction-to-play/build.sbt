name := """baeldung-play-framework"""
organization := "com.baeldung"

version := "1.0-SNAPSHOT"

enablePlugins(PlayScala)

scalaVersion := "2.13.10"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
