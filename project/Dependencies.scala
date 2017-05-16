import sbt._

object Dependencies {
  private val slickVersion = "3.2.0"
  private val slick = "com.typesafe.slick" %% "slick" % slickVersion
  private val slickHikaricp = "com.typesafe.slick" %% "slick-hikaricp" % slickVersion

  private val h2 = "com.h2database" % "h2" % "1.4.195"

  private val forkliftVersion = "0.3.0"
  private val forklift = "com.liyaos" %% "scala-forklift-slick" % forkliftVersion

  private val slf4j = "org.slf4j" % "slf4j-nop" % "1.7.25"
}

trait Dependencies {
  import Dependencies._

  def dbDependencies = Seq(slick, slickHikaricp, h2, slf4j)
  def migrationsDependencies = Seq(forklift, slickHikaricp, h2, slf4j)
}