package abstractPattern

trait GUIFactory:
  def createButton: Button
  def createCheckbox: CheckBox
