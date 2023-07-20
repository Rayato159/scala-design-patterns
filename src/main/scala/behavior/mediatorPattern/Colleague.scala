package behavior.mediatorPattern

trait Colleague:
  def send(message: String): Unit
  def receive(message: String): Unit
