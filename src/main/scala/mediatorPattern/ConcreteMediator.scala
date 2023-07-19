package mediatorPattern

case class ConcreteMediator(private var colleagues: List[Colleague] = List.empty) extends Mediator:
  override def addColleague(colleague: Colleague): Unit =
    colleagues = colleague :: colleagues

  override def sendMessage(sender: Colleague, message: String): Unit =
    colleagues.filter(_ != sender).foreach(_.receive(message))

