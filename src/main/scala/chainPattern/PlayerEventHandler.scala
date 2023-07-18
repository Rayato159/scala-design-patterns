package chainPattern

case class PlayerEventHandler(private var nextHandler: EventHandler = null) extends EventHandler:
  override def setNext(handler: EventHandler): EventHandler =
    nextHandler = handler
    handler
  override def handleEvent(event: GameEvent): Unit =
    event.name match
      case "player_input" => println("PlayerEventHandler handles player input event.")
      case _ => nextHandler.handleEvent(event)
