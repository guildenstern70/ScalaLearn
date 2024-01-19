val scala3Version = "3.3.1"

lazy val root = project
        .in(file("."))
        .settings(
            name := "Scala Learn",
            version := "0.13",
            scalaVersion := scala3Version,
            libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.15",
            libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
        )

