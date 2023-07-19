package mementoPattern

@main def start(): Unit =
  println("Memento Pattern")

  val editor: Editor = Editor("state 1", 0, 0, 100)
  val command: Command = Command(editor)
  command.makeBackup()

  // State 1
  println(editor)

  // State 2
  editor.setText("state 2")
  editor.setCursor(20, 40)
  editor.setSelectionWidth(50)

  println(editor)

  // Undo
  command.undo()
  println(editor)