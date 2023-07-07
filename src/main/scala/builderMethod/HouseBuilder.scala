package builderMethod

trait HouseBuilder:
  def buildWall: String
  def buildRoof: String
  
  def installDoor: String
  def installWindows: String

  def get: Unit =
    println(buildRoof)
    println(buildWall)
    println(installDoor)
    println(installWindows)
