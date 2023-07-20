package behavior.observerPattern

class WeatherStation(
                           private var temperature: Double = 0.0,
                           private var humidity: Double = 0.0,
                         ) extends Subject:
  def updateWeatherData(temperature: Double, humidity: Double): Unit =
    this.temperature = temperature
    this.humidity = humidity
    notifyObservers(temperature, humidity)

