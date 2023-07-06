package factoryMethod

case class Car() extends Product:
  override def operation(): String = s"create a new car"
