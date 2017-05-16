package ru.bofur.medstream.model.v1
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object tables extends {
  val profile = slick.jdbc.H2Profile
} with tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{ GetResult => GR }

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Users.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /**
   * Entity class storing rows of table Users
   *  @param id Database column id SqlType(INTEGER), PrimaryKey
   *  @param first Database column first SqlType(VARCHAR)
   *  @param last Database column last SqlType(VARCHAR)
   */
  case class UsersRow(id: Int, first: String, last: String)
  /** GetResult implicit for fetching UsersRow objects using plain SQL queries */
  implicit def GetResultUsersRow(implicit e0: GR[Int], e1: GR[String]): GR[UsersRow] = GR {
    prs =>
      import prs._
      UsersRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table users. Objects of this class serve as prototypes for rows in queries. */
  class Users(_tableTag: Tag) extends profile.api.Table[UsersRow](_tableTag, "users") {
    def * = (id, first, last) <> (UsersRow.tupled, UsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(first), Rep.Some(last)).shaped.<>({ r => import r._; _1.map(_ => UsersRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INTEGER), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column first SqlType(VARCHAR) */
    val first: Rep[String] = column[String]("first")
    /** Database column last SqlType(VARCHAR) */
    val last: Rep[String] = column[String]("last")
  }
  /** Collection-like TableQuery object for table Users */
  lazy val Users = new TableQuery(tag => new Users(tag))
}
object Version {
  def version = 1
}
