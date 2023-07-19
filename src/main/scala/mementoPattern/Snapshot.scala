package mementoPattern

case class Snapshot(
                   private val editor: Editor,
                   private val text: String,
                   private val curX: Int,
                   private val curY: Int,
                   private val selectionWidth: Int
                   ):
  def restore(): Int =
    if editor.snapshots == List.empty then
      println("no more backup")
      return -1

    editor.snapshots = editor.snapshots.tail

    val temp: Snapshot = editor.snapshots.head
    editor.setText(temp.text)
    editor.setCursor(temp.curX, temp.curY)
    editor.setSelectionWidth(temp.selectionWidth)
    return 1
