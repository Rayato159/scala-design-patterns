package strategyPattern

@main def start(): Unit =
  println("Strategy Pattern")

  val credit: PaymentStrategy = CreditCardPayment()
  val cash: PaymentStrategy = CashPayment()

  var cart: ShoppingCart = ShoppingCart(credit)

  cart.checkout(100)

  cart = ShoppingCart(cash)
  cart.checkout(200)