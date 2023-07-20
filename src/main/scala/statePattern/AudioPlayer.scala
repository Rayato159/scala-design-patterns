package statePattern

case class AudioPlayer(private var currentState: State):
  def play(): Unit =
    currentState.play()
    currentState = Playing()
  def pause(): Unit =
    currentState.pause()
    currentState = Paused()
  def stop(): Unit =
    currentState.stop()
    currentState = Stopped()