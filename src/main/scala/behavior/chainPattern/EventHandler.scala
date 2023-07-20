package behavior.chainPattern

trait EventHandler:
  def setNext(handler: EventHandler): EventHandler
  def handleEvent(event: GameEvent): Unit
