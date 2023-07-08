package bridgePattern

case class Square(width: Double) extends Shape:
  override def draw(renderer: Renderer): Unit =
    println("Drawing a square")
    renderer.renderShape()
