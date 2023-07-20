package templatePattern

case class FireRice() extends Recipe:
  override def prepareIngredients(): Unit =
    println("prepare a kaow for cook")

  override def cookRecipe(): Unit =
    println("cook!")

  override def serve(): Unit =
    println("serve with hotpot")
