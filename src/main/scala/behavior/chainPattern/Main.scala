package behavior.chainPattern

@main def start() =
  println("Chain Pattern")

  val playerEventHandler: EventHandler = PlayerEventHandler()
  val enemyEventHandler: EventHandler = playerEventHandler.setNext(EnemyEventHandler())

  // Game start
  val event1: GameEvent = GameEvent("player_input")
  val event2: GameEvent = GameEvent("enemy_spawn")
  val event3: GameEvent = GameEvent("enemy_fight")

  // Handle event
  playerEventHandler.handleEvent(event1)
  enemyEventHandler.handleEvent(event2)
  enemyEventHandler.handleEvent(event3)