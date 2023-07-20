package structure.adapterPattern

@main def start() =
  println("Adapter pattern")

  val squrePeg: SquarePeg = SquarePeg(2.0)
  val adapter: SquarePegAdapter = SquarePegAdapter(squrePeg)

  val hole: RoundHole = RoundHole(1.0)

  println(hole.fits(adapter.toRoundPeg))