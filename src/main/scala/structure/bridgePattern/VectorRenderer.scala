package structure.bridgePattern

case class VectorRenderer() extends Renderer:
  override def renderShape(): Unit = println("Rendering in vector form")
