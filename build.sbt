import Settings._

addCommandAlias("mg", "migrations/run")

lazy val model = (project in file("model"))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= dbDependencies)
  .settings(scalacOptions ++=
    wartExclude((scalaSource in Compile).value / "ru/bofur/medstream/model"))

lazy val migrations = (project in file("migrations"))
  .settings(commonSettings: _*)
  .settings(resolvers += Resolver.jcenterRepo)
  .settings(libraryDependencies ++= migrationsDependencies)
  .settings(scalacOptions ++=
    wartExclude((scalaSource in Compile).value / "migrations"))
  .dependsOn(model)





