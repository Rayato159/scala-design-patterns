package singletonPattern

import com.sun.security.auth.UserPrincipal

case class Database private ():
  def queryRow(query: String) =
    if query == "SELECT * FROM user" then
      val users: List[User] = List(
        User(1, "John"),
        User(2, "Kaow"),
        User(3, "Lookhin")
      )

      for
        user <- users
      do
        println(user)
    else
      println(s"syntax error: $query")

object Database:
  private val instance: Database = Database()

  def getInstance: Database = instance
