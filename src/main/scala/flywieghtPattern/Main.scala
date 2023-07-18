package flywieghtPattern

@main def start(): Unit =
  println("Flyweight Pattern")

  val character1 = CharacterFactory.getCharacter("goblin")
  val character2 = CharacterFactory.getCharacter("goblin")
  val character3 = CharacterFactory.getCharacter("goblin")
  
  character1.render(10, 20)
  character2.render(30, 40)
  character3.render(50, 60)