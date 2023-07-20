package behavior.commandPattern

case class JumpCommand(receiver: Player) extends Command:
  override def execute(): Unit =
    receiver.jump()
