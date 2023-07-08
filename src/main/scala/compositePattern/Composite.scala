package compositePattern

class Composite:
  private var shapes: List[Shape] = List.empty

  def add(shape: Shape): Unit =
    shapes = shape :: shapes
    
  def add(newShapes: Composite): Unit =
    shapes = newShapes.getShapes() ::: shapes

  def pop(): Shape =
    val top = shapes.head
    shapes = shapes.tail
    top
    
  def getShapes(): List[Shape] = shapes
  
  def draw(): Unit =
    shapes.foreach(_.draw())
