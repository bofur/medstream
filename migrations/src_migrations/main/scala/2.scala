import com.liyaos.forklift.slick.APIMigration
import ru.bofur.medstream.model.v1.tables._
import slick.migration.api.{ H2Dialect, TableMigration }

object M2 {
  implicit val dialect = new H2Dialect

  Migrations.migrations = Migrations.migrations :+ APIMigration(2)(
    TableMigration(Users).add(_.login: String, _.password: String)
  )
}