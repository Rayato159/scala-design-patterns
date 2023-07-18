package commandPattern

case class AttackCommand(receiver: Player) extends Command:
  override def execute(): Unit =
    receiver.attack()
