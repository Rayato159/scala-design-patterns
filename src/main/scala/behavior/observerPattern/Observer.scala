package behavior.observerPattern

trait Observer:
  def update(temperature: Double, humidity: Double): Unit
