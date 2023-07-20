package behavior.visitorPattern

trait ShapeVisitor:
  def visit(circle: Circle): Unit
  def visit(rectangle: Rectangle): Unit
