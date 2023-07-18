package commandPattern

case class CommandHandler(private var command: Command = null):
  def setCommand(command: Command): Unit =
    this.command = command

  def handleInput(): Unit =
    if command != null then
      command.execute()