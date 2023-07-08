package compositePattern

case class Square(width: Double) extends Shape:
  override def draw(): Unit = println("Drawing a square")
