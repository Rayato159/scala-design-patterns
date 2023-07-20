package creation.abstractPattern

case class WinFactory() extends GUIFactory:
  override def createButton: Button = WinButton()

  override def createCheckbox: CheckBox = WinCheckBox()
