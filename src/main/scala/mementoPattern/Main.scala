package mementoPattern

@main def start(): Unit =
  println("Memento Pattern")

  // State 1
  val editor: Editor = Editor("state 1", 0, 0, 0)
  println(editor)

  val command: Command = Command(editor)
  command.makeBackup()

  // State 2
  editor.setText("state 2")
  editor.setCursor(20, 40)
  editor.setSelectionWidth(50)
  command.makeBackup()
  println(editor)

  // State 3
  editor.setText("state 3")
  editor.setCursor(30, 45)
  editor.setSelectionWidth(70)
  command.makeBackup()
  println(editor)

  // Undo
  command.undo()
  command.undo()
  println(editor)