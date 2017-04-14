package in.deveshgupta.tutorials.designpatterns.collection.visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements IVisitable {

  private List<Order> orders;

  public Customer() {
    orders = new ArrayList<>();
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);
    for (Order order : orders) {
      order.accept(visitor);
    }
  }

  public List<Order> getOrders() {
    return orders;
  }
}
