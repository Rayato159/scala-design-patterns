package behavior.commandPattern

case class MoveCommand(receiver: Player) extends Command:
  override def execute(): Unit =
    receiver.move()
