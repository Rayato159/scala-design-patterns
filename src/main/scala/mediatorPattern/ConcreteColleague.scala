package mediatorPattern

case class ConcreteColleague(name: String, mediator: Mediator) extends Colleague:
  override def send(message: String): Unit =
    println(s"name: $name, sending message: $message")
    mediator.sendMessage(this, message)
  override def receive(message: String): Unit =
    println(s"name: $name, receiving message: $message")
