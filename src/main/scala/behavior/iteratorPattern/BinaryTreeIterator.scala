package behavior.iteratorPattern

import behavior.iteratorPattern

import scala.collection.Iterator

class BinaryTreeIterator(private val root: Node) extends iteratorPattern.Iterator:
  private var stack: List[Node] = List.empty
  private var current: Node = root

  override def hasNext: Boolean = current != null || stack.nonEmpty

  override def next(): Int =
    while (current != null) do
      stack = current :: stack
      current = current.left

    val node = stack.head
    stack = stack.tail
    current = node.right

    node.data
