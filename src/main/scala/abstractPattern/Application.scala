package abstractPattern

case class Application(var factory: GUIFactory):
  def createUI() =
    println(factory.createButton.get)
    println(factory.createCheckbox.get)