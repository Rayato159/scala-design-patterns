package structure.bridgePattern

case class Circle(radius: Double) extends Shape:
  override def draw(renderer: Renderer): Unit =
    println("Drawing a circle")
    renderer.renderShape()
