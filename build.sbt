scalaVersion := "3.3.6"
organization := "scalalearn"

lazy val root = (project in file("."))
        .settings(
            name := "ScalaLearn",
            version := "0.14",
            scalaVersion := "3.3.6",
            libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19",
            libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
        )

