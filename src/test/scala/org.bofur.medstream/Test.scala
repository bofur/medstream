//import sbt._
//
//object Settings extends AnyRef with Dependencies {
//  private[this] val commonSettings: Seq[sbt.Def.Setting[_ >: sbt.Task[Seq[String]] with String <: java.io.Serializable]] =
//    collection.this.Seq.apply[sbt.Def.Setting[_ >: sbt.Task[Seq[String]] with String <: java.io.Serializable]](
//      sbt.Keys.organization.set(InitializeInstance.pure[String]((() => "org.bofur")), LinePosition.apply("/home/bofur/projects/med-stream/project/Settings.scala", 8)),
//      sbt.Keys.version.set(InitializeInstance.pure[String]((() => "0.0.1")), LinePosition.apply("/home/bofur/projects/med-stream/project/Settings.scala", 9)),
//      sbt.Keys.scalaVersion.set(InitializeInstance.pure[String]((() => "2.12.2")), LinePosition.apply("/home/bofur/projects/med-stream/project/Settings.scala", 11)),
//      sbt.Keys.scalacOptions.appendN[Seq[String]](FullInstance.pure[Seq[String]](
//        (() => collection.this.Seq.apply[String](
//          "-target:jvm-1.8", "-deprecation",
//          "-encoding",
//          "UTF-8",
//          "-feature",
//          "-language:existentials",
//          "-language:higherKinds",
//          "-language:implicitConversions",
//          "-unchecked",
//          "-Xfatal-warnings",
//          "-Xlint",
//          "-Yno-adapted-args",
//          "-Ywarn-dead-code",
//          "-Ywarn-numeric-widen",
//          "-Ywarn-value-discard",
//          "-Xfuture",
//          "-Ywarn-unused",
//          "-Ywarn-unused-import"))
//      ), LinePosition.apply("/home/bofur/projects/med-stream/project/Settings.scala", 13))(sbt.this.Append.appendSeq[String, String])
//    );
//
//  def commonSettings: Seq[sbt.Def.Setting[_ >: sbt.Task[Seq[String]] with String <: java.io.Serializable]] = Settings.this.commonSettings;
//
//  def wartExclude(pkgDir: java.io.File, logger: Option[sbt.Logger]): Seq[String] = {
//    def genOptions(dir: scala.reflect.io.Directory): Iterator[String] =
//      dir.deepFiles.withFilter((file: scala.reflect.io.File) =>
//        file.endsWith(io.this.Path.string2path(".scala")))
//        .map[String]((file: scala.reflect.io.File) =>
//        scala.StringContext.apply("-P:wartremover:excluded:", "").s(file.toAbsolute));
//
//    val options: Seq[String] = scala.reflect.io.File.apply(io.this.Path.jfile2path(pkgDir))(io.this.Codec.fallbackSystemCodec).ifDirectory[Iterator[String]]({
//      (dir: scala.reflect.io.Directory) => genOptions(dir)
//    }).getOrElse[Iterator[String]](scala.`package`.Iterator.empty).toSeq;
//    scala.this.Predef.println(options);
//    options
//  }
//}
