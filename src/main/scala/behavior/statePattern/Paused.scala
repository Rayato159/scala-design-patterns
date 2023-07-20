package behavior.statePattern

case class Paused() extends State:
  override def play(): Unit =
    println("play")
  override def pause(): Unit =
    println("Already paused.")
  override def stop(): Unit =
    println("stop")