package factoryMethod

case class ConcreteFactoryGun() extends ProductFactory:
  override def createProduct(): Product = Gun()
