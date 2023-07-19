package mementoPattern

case class Snapshot(
                   private val editor: Editor,
                   private val text: String,
                   private val curX: Int,
                   private val curY: Int,
                   private val selectionWidth: Int
                   ):
  def restore(): Unit =
    editor.setText(text)
    editor.setCursor(curX, curY)
    editor.setSelectionWidth(selectionWidth)
