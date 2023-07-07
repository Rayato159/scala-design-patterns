package abstractMethod

case class MacFactory() extends GUIFactory:
  override def createButton: Button = MacButton()

  override def createCheckbox: CheckBox = MacCheckBox()
