package structure.decoratorPattern

@main def start() =
  println("Decorator Pattern")

  val developer: Human = Developer()
  val backend: Backend = Backend(developer)
  
  backend.operation()