package proxyPattern

@main def start() =
  println("Proxy Pattern")

  val image1: Image = ImageProxy("dog.jpg")
  val image2: Image = ImageProxy("cat.jpg")

  // Init an image
  image1.display()
  image2.display()

  // Display
  image1.display()
  image2.display()