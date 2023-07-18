package iteratorPattern

trait Iterator:
  def hasNext: Boolean
  def next(): Int
