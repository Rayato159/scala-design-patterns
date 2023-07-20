package visitorPattern

case class ShapeProperties() extends ShapeVisitor:
  override def visit(circle: Circle): Unit =
    val area: Double = math.Pi * math.pow(circle.radius, 2)
    println(s"shape: rectangle, properties: ${circle.radius}, area: $area")

  override def visit(rectangle: Rectangle): Unit =
    val area: Double = rectangle.width * rectangle.height
    println(s"shape: rectangle, properties: ${rectangle.width} ${rectangle.height}, area: $area")
