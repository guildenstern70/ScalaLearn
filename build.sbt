val scala3Version = "3.0.1"

lazy val root = project
        .in(file("."))
        .settings(
            name := "Scala Learn",
            version := "0.11",
            scalaVersion := scala3Version,
            libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9",
            libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
        )

