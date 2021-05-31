val scala3Version = "3.0.0"

lazy val root = project
        .in(file("."))
        .settings(
            name := "Scala Learn",
            version := "0.8",
            scalaVersion := scala3Version,
            libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9",
            libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
        )

