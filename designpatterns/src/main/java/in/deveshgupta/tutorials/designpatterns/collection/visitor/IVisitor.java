package in.deveshgupta.tutorials.designpatterns.collection.visitor;

public interface IVisitor {
  public void visit(Customer customer);

  public void visit(Item item);

  public void visit(Order order);
}
