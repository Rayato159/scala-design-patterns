package behavior.mediatorPattern

trait Mediator:
  def addColleague(colleague: Colleague): Unit
  def sendMessage(sender: Colleague, message: String): Unit
