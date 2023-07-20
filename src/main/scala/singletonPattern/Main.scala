package singletonPattern

@main def start(): Unit =
  println("Singleton Method")

  val db: Database = Database.getInstance
  db.queryRow("SELECT * FROM user")
  db.queryRow("SELECT * FROM product")