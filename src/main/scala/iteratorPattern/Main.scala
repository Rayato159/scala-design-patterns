package iteratorPattern

@main def start(): Unit =
  println("Iterator Pattern")
      
  val bTree: BinaryTree = BinaryTree()
  bTree.insert(1)
  bTree.insert(2)
  bTree.insert(3)
  bTree.insert(4)
  bTree.insert(5)

  val iterator: Iterator = BinaryTreeIterator(bTree.getRoot)

  while iterator.hasNext do
      println(iterator.next())