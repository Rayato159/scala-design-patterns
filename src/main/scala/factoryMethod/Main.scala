package factoryMethod

@main def start(): Unit =
  println("Factory Method")

  val ak47 = GunFactory.createGun("ak47")
  ak47 match
    case Some(v) => println(v.doStuff)
    case _ => println("gun not found")

  val m4a1 = GunFactory.createGun("m4a1")
  m4a1 match
    case Some(v) => println(v.doStuff)
    case _ => println("gun not found")