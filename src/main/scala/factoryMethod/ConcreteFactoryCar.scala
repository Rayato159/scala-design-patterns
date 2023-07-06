package factoryMethod

case class ConcreteFactoryCar() extends ProductFactory:
  override def createProduct(): Product = Car()