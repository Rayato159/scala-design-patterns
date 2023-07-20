package behavior.mediatorPattern

@main def start() =
  println("Mediator Pattern")

  val mediator: Mediator = ConcreteMediator()
  val colleague1: Colleague = ConcreteColleague("Lookhin", mediator)
  val colleague2: Colleague = ConcreteColleague("Kaow", mediator)

  mediator.addColleague(colleague1)
  mediator.addColleague(colleague2)

  colleague1.send("ta dai ma")
  colleague2.send("o kai e ri")