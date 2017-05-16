import com.liyaos.forklift.slick.SlickCodegen

/**
 * Created by bofur on 23.04.17.
 */
// TODO: replace with typesafe config option
trait Codegen extends SlickCodegen {
  override def tableNames: Seq[String] = Seq("users")

  override val fileName: String = "tables.scala"

  override val generatedDir = s"${System.getProperty("user.dir")}/model/src/main/scala"

  override def pkgName(version: String): String = s"ru.bofur.medstream.model.$version"
}

