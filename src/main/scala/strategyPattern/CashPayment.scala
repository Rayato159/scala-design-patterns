package strategyPattern

case class CashPayment() extends PaymentStrategy:
  override def pay(amount: Double): Unit =
    println(s"Paid $amount in Cash.")
