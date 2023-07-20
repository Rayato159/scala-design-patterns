package abstractPattern

@main def start(): Unit =
  println("Abstract Method")
  
  val win: Application = Application(WinFactory())
  win.createUI()
  
  val mac: Application = Application(MacFactory())
  mac.createUI()