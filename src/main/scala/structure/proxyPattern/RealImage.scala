package structure.proxyPattern

case class RealImage(filename: String) extends Image:
  private def loadFromDisk(): Unit =
    println(s"loading image from disk filename: $filename")

  override def display(): Unit =
    println(s"displaying image filename: $filename")
