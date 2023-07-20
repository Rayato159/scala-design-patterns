package behavior.observerPattern

class Subject(private var observers: List[Observer] = List.empty):
  def addObserver(observer: Observer): Unit =
    observers = observer :: observers

  def removeObserver(observer: Observer): Unit =
    observers = observers.filterNot(_ == observer)

  def notifyObservers(temperature: Double, humidity: Double): Unit =
    observers.foreach(_.update(temperature, humidity))