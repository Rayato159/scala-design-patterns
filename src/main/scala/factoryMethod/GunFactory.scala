package factoryMethod

case object GunFactory:
  def createGun(gunType: String): Option[Gun] =
    gunType.toLowerCase() match
      case "ak47" => Some(Ak47())
      case "m4a1" => Some(M4a1())
      case _ => None
