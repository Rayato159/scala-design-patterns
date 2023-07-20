package strategyPattern

trait PaymentStrategy:
  def pay(amount: Double): Unit
