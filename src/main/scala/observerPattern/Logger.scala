package observerPattern

class Logger extends Observer:
  override def update(temperature: Double, humidity: Double): Unit =
    println(s"Logger: Weather data received - Temperature: $temperature°C, Humidity: $humidity%")
