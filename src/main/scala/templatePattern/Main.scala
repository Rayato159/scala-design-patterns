package templatePattern

@main def start(): Unit =
  println("Template Pattern")
  
  val tomyumkung: Recipe = TomYumKung()
  val firerice: Recipe = FireRice()
  
  tomyumkung.cook()
  firerice.cook()