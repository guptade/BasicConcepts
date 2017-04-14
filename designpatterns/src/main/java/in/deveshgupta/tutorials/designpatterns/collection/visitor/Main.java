package in.deveshgupta.tutorials.designpatterns.collection.visitor;

public class Main {

  private static Customer getCustomer() {
    Customer c1 = new Customer();

    Order order = new Order();
    order.getItems().add(new Item());
    order.getItems().add(new Item());
    order.getItems().add(new Item());
    order.getItems().add(new Item());
    c1.getOrders().add(order);

    order = new Order();
    order.getItems().add(new Item());
    order.getItems().add(new Item());
    c1.getOrders().add(order);

    order = new Order();
    order.getItems().add(new Item());
    c1.getOrders().add(order);
    return c1;
  }

  public static void main(String[] args) {
    Customer c1 = getCustomer();
    c1.accept(new Visitor() {
      @Override
      public void visit(Customer customer) {
        System.out.println("Customer object" + customer);
      }

      @Override
      public void visit(Item item) {
        System.out.println("Item object" + item);
      }

      @Override
      public void visit(Order order) {
        System.out.println("Order object" + order);
      }
    });

  }

}
