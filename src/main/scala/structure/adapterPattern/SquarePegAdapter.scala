package structure.adapterPattern

case class SquarePegAdapter(peg: SquarePeg):
  private def getRadius: Double = peg.getWidth * math.sqrt(2) / 2
  def toRoundPeg: RoundPeg = RoundPeg(getRadius)
