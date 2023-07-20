package behavior.statePattern

case class Stopped() extends State:
  override def play(): Unit =
    println("play")

  override def pause(): Unit =
    println("pause")

  override def stop(): Unit =
    println("Already stopped")
