package behavior.commandPattern

case class Player():
  def attack(): Unit =
    println("attack!")

  def jump(): Unit =
    println("jump")

  def move(): Unit =
    println("move")