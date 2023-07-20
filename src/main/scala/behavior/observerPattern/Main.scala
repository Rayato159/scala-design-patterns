package behavior.observerPattern

@main def start(): Unit =
  println("Observer Pattern")

  val weatherStation: WeatherStation = WeatherStation()
  val logger: Observer = Logger()
  val display: Observer = Display()

  weatherStation.addObserver(logger)
  weatherStation.addObserver(display)

  weatherStation.updateWeatherData(25.5, 60.0)
  weatherStation.updateWeatherData(28.0, 55.0)