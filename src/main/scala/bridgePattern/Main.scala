package bridgePattern

@main def start() =
  println("Bridge pattern")

  val raster: Renderer = RasterRenderer()
  val vector: Renderer = VectorRenderer()

  val circle: Circle = Circle(2.0)
  val square: Square = Square(1.0)

  circle.draw(raster)
  circle.draw(vector)

  square.draw(raster)
  square.draw(vector)