package visitorPattern

case class Circle(val radius: Double) extends Shape:
  override def accept(visitor: ShapeVisitor): Unit =
    visitor.visit(this)