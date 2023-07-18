package iteratorPattern

case class BinaryTree(private var root: Node = null):
  def insert(data: Int): Unit =
    if this.root == null then
      this.root = Node(data, null, null)
    else
      this.insert(data, this.root)
  def insert(data: Int, node: Node): Unit =
    if data < node.data then
      if node.left == null then
        node.left = Node(data, null, null)
      else
        this.insert(data, node.left)

    else if data > node.data then
      if node.right == null then
        node.right= Node(data, null, null)
      else
        this.insert(data, node.right)

    else
      println(s"error, data $data is duplicate")

  def getRoot: Node = this.root
