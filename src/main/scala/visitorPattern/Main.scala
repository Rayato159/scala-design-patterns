package visitorPattern

@main def start(): Unit =
  println("Visitor Pattern")

  val visitor: ShapeVisitor = ShapeProperties()
  val shapes: List[Shape] = List(
    Rectangle(1.0, 2.0),
    Rectangle(5.0, 2.0),
    Circle(1.0),
    Circle(4.0),
    Rectangle(2.0, 3.0)
  )

  shapes.foreach(_.accept(visitor))