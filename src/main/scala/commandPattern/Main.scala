package commandPattern

@main def start(): Unit =
  println("Command Pattern")

  val player: Player = Player()
  val commandHandler: CommandHandler = CommandHandler()

  val attackCommand: Command = AttackCommand(player)
  val moveCommand: Command = MoveCommand(player)
  val jumpCommand: Command = JumpCommand(player)

  commandHandler.setCommand(moveCommand)
  commandHandler.handleInput()
  commandHandler.handleInput()
  commandHandler.handleInput()

  commandHandler.setCommand(jumpCommand)
  commandHandler.handleInput()

  commandHandler.setCommand(attackCommand)
  commandHandler.handleInput()
  commandHandler.handleInput()