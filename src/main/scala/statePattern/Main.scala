package statePattern

@main def start(): Unit =
  println("State Pattern")
  
  val sonyWalkman: AudioPlayer = AudioPlayer(Stopped())

  sonyWalkman.play()
  sonyWalkman.play()
  sonyWalkman.pause()
  sonyWalkman.play()
  sonyWalkman.stop()
  sonyWalkman.pause()
  sonyWalkman.stop()