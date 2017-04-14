package in.deveshgupta.tutorials.designpatterns.creational.builder;

class Waiter {
  private PizzaBuilder pizzaBuilder;

  public void constructPizza() {
    pizzaBuilder.createNewPizzaProduct();
    pizzaBuilder.buildDough();
    pizzaBuilder.buildSauce();
    pizzaBuilder.buildTopping();
  }

  public Pizza getPizza() {
    return pizzaBuilder.getPizza();
  }

  public void setPizzaBuilder(PizzaBuilder pb) {
    pizzaBuilder = pb;
  }
}
