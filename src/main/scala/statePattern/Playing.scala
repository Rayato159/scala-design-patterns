package statePattern

case class Playing() extends State:
  override def play(): Unit =
    println("Already playing")

  override def pause(): Unit =
    println("pause")

  override def stop(): Unit =
    println("stop")
