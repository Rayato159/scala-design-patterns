package decoratorPattern

// Client view
class Backend(human: Human) extends Decorator(human):
  override def operation(): Unit =
    println("Learn Golang + DevOps")
    super.operation()
    println("Have no life T^T")
