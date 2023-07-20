package structure.flywieghtPattern

case class Goblin() extends Character:
  override def render(x: Int, y: Int): Unit =
    println(s"Rendering goblin at -> ($x, $y)...")
