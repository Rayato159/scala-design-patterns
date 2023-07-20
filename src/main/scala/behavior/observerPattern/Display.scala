package behavior.observerPattern

class Display extends Observer:
  override def update(temperature: Double, humidity: Double): Unit =
    println(s"Display: Temperature is $temperature°C, Humidity is $humidity%")
