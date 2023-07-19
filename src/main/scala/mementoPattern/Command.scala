package mementoPattern

case class Command(editor: Editor, var backup: Snapshot = null):
  def makeBackup(): Unit =
    backup = editor.createSnapshot()

  def undo(): Unit =
    if backup != null then
      backup.restore()
