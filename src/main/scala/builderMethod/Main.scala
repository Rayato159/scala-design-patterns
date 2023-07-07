package builderMethod

@main def start(): Unit =
  println("Builder Method")

  val jp: JapaneseHouseBuilder = JapaneseHouseBuilder()
  val director: Director = Director(jp)
  director.builder.get