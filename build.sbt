val scala3Version = "3.1.2"

lazy val root = project
        .in(file("."))
        .settings(
            name := "Scala Learn",
            version := "0.12",
            scalaVersion := scala3Version,
            libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.11",
            libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % "test"
        )

