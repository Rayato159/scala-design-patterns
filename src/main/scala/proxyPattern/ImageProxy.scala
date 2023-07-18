package proxyPattern

case class ImageProxy(filename: String) extends Image:
  private var realImage: RealImage = _
  override def display(): Unit =
    if realImage == null then
      realImage = RealImage(filename)
    else
      realImage.display()
