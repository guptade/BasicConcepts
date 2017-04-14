package in.deveshgupta.tutorials.designpatterns.creational.builder;

public class Main {
  public static void main(String[] args) {
    Waiter waiter = new Waiter();
    PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
    new SpicyPizzaBuilder();
    waiter.setPizzaBuilder(hawaiianPizzabuilder);
    waiter.constructPizza();
    Pizza pizza = waiter.getPizza();
    System.out.println(pizza);
  }
}
