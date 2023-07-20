package structure.bridgePattern

case class RasterRenderer() extends Renderer:
  override def renderShape(): Unit = println("Rendering in raster form")
