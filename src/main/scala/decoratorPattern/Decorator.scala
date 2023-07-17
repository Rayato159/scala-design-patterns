package decoratorPattern

trait Decorator(human: Human) extends Developer:

  override def operation(): Unit =
    println("Write a code")
    human.operation()
    println("Got a bug")
