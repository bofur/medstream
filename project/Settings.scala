import sbt.Keys._
import sbt._

import scala.reflect.io.{Directory, File}

object Settings extends Dependencies {
  val commonSettings = Seq(
    organization := "org.bofur",
    version := "0.0.1",

    scalaVersion := "2.12.2",

    scalacOptions ++= Seq(
      "-target:jvm-1.8",
      "-deprecation",
      "-encoding", "UTF-8", // yes, this is 2 args
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-language:implicitConversions",
      "-unchecked",
      "-Xfatal-warnings",
      "-Xlint",
      "-Yno-adapted-args",
      "-Ywarn-dead-code", // N.B. doesn't work well with the ??? hole
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Xfuture",
      "-Ywarn-unused",
      "-Ywarn-unused-import" // 2.11 only
    )
  )

  val excludedWartFiles = settingKey[Seq[String]]("excludedWartFiles")
  val pkg = settingKey[java.io.File]("pkg")

  def wartExclude(pkgDir: java.io.File): Seq[String] = {
    def genOptions(dir: Directory) = for {
      file <- dir.deepFiles
      if file.extension == "scala"
    } yield s"-P:wartremover:excluded:${file.toAbsolute}"

    File(pkgDir).ifDirectory(genOptions).getOrElse(Iterator.empty).toSeq
  }
}
