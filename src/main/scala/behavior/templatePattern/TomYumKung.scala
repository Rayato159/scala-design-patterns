package behavior.templatePattern

case class TomYumKung() extends Recipe:
  override def prepareIngredients(): Unit =
    println("prepare a kung for cook")

  override def cookRecipe(): Unit =
    println("cook!")

  override def serve(): Unit =
    println("serve with hotpot")
