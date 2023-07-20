package visitorPattern

case class Rectangle(val width: Double, val height: Double) extends Shape:
  override def accept(visitor: ShapeVisitor): Unit =
    visitor.visit(this)
