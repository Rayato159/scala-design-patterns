package visitorPattern

trait Shape:
  def accept(visitor: ShapeVisitor): Unit
