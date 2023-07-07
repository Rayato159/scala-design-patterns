package abstractMethod

@main def start() =
  println("Abstract Method")
  
  val win: Application = Application(WinFactory())
  win.createUI()
  
  val mac: Application = Application(MacFactory())
  mac.createUI()