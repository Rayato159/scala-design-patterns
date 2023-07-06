package factoryMethod

@main def start(): Unit =
  val gun: ConcreteFactoryGun = ConcreteFactoryGun()
  val ak47: Product = gun.createProduct()
  println(ak47.operation())

  val car: ConcreteFactoryCar = ConcreteFactoryCar()
  val nissan: Product = car.createProduct()
  println(nissan.operation())