val scala3Version = "2.13.5"

lazy val root = project
        .in(file("."))
        .settings(
            name := "Scala Learn",
            version := "0.8",
            scalaVersion := scala3Version,
            libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % "test",
            libraryDependencies += "junit" % "junit" % "4.+"
        )