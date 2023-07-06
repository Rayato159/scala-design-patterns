package factoryMethod

case class Gun() extends Product:
  override def operation(): String = s"create a new gun"