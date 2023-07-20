package structure.compositePattern

case class Circle(radius: Double) extends Shape:
  override def draw(): Unit = println("Drawing a circle")
