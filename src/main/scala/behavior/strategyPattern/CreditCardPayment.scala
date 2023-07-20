package behavior.strategyPattern

case class CreditCardPayment() extends PaymentStrategy:
  override def pay(amount: Double): Unit =
  println(s"Paid $amount via Credit Card.")
