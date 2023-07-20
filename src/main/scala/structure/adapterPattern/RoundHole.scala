package structure.adapterPattern

case class RoundHole(radius: Double):
  def fits(peg :RoundPeg): Boolean =
    radius >= peg.getRadius