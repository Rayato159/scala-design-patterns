package creation.prototypePattern

@main def start(): Unit =
  println("Prototype Method")
  
  val thill: JapaneseSong = JapaneseSong("Thill", "Aimer")
  val tinyDances: JapaneseSong = thill.clone("tiny dances")
  
  println(thill)
  println(tinyDances)
