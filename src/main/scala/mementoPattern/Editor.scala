package mementoPattern

case class Editor(
                   private var text: String,
                   private var curX: Int,
                   private var curY: Int,
                   private var selectionWidth: Int
                 ):
  def setText(text: String): Unit =
    this.text = text

  def setCursor(x: Int, y: Int): Unit =
    this.curX = x
    this.curY = y

  def setSelectionWidth(width: Int): Unit =
    this.selectionWidth = width

  def createSnapshot(): Snapshot =
    Snapshot(this, text, curX, curY, selectionWidth)

  override def toString: String = s"text: $text, cursor: $curX, $curY, width: $selectionWidth"
