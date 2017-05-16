import com.liyaos.forklift.slick.{ SlickMigrationCommandLineTool, SlickMigrationCommands, SlickMigrationManager }

/**
 * Created by bofur on 23.04.17.
 */
object Migrations extends App
    with SlickMigrationCommandLineTool
    with SlickMigrationCommands
    with SlickMigrationManager
    with Codegen {

  val initialization = MigrationSummary
  execCommands(args.toList)

}
