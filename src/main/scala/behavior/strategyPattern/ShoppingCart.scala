package behavior.strategyPattern

class ShoppingCart(private var paymentStrategy: PaymentStrategy):
  def checkout(amount: Double): Unit =
    paymentStrategy.pay(amount)
