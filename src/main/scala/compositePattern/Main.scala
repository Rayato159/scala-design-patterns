package compositePattern

@main def start() =
  println("Composite pattern")

  val circle1: Circle = Circle(5.0)
  val circle2: Circle = Circle(3.0)
  val square1: Square = Square(10.0)

  val group: Composite = Composite()
  group.add(circle1)
  group.add(square1)

  val nestedGroup = Composite()
  nestedGroup.add(circle2)
  nestedGroup.add(group)

  nestedGroup.draw()