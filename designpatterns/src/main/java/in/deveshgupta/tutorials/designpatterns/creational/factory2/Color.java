package in.deveshgupta.tutorials.designpatterns.creational.factory2;

public interface Color {
  public default void print() {
    System.out.println(getClass().getSimpleName() + " color!");
  }
}
