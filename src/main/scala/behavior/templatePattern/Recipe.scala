package behavior.templatePattern

trait Recipe:
  def cook(): Unit =
    prepareIngredients()
    cookRecipe()
    serve()

  protected def prepareIngredients(): Unit
  protected def cookRecipe(): Unit
  protected def serve(): Unit
