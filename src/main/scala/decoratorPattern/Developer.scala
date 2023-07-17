package decoratorPattern

class Developer extends Human:
  override def operation(): Unit = println("executing an operation in developer")
