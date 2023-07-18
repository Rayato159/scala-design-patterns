package facadePattern

val map: Map = Map()
val inventory: Inventory = Inventory()
val block: Block = Block()
def operation(): Unit =
  map.load()
  inventory.open()
  block.select()
  block.place()

@main def start() =
  println("Facade Pattern")
  operation()

