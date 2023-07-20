package creation.builderPattern

case class JapaneseHouseBuilder() extends HouseBuilder:
  override def buildRoof: String = "build Japanese roof"
  override def buildWall: String = "build Japanese wall"
  
  override def installDoor: String = "installed a Japanese door"
  override def installWindows: String = "installed a Japanese door"
    
