package behavior.chainPattern

case class EnemyEventHandler(private var nextHandler: EventHandler = null) extends EventHandler:
    override def setNext(handler: EventHandler): EventHandler =
      nextHandler = handler
      handler

    override def handleEvent(event: GameEvent): Unit =
        event.name match
          case "enemy_spawn" => println("EnemyEventHandler handles enemy spawn event.")
          case "enemy_fight" => println("EnemyEventHandler handles enemy fight player event")
          case _ => nextHandler.handleEvent(event)