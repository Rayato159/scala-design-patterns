package statePattern

trait State:
  def play(): Unit
  def pause(): Unit
  def stop(): Unit
