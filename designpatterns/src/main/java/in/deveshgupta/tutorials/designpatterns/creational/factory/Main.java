package in.deveshgupta.tutorials.designpatterns.creational.factory;

public class Main {

  public static void main(String[] args) {
    final String circle = Circle.class.getSimpleName();
    final Shape shape = ShapeFactory.INSTANCE.getShape(circle);
    shape.draw();

    final Shape shape2 = ShapeFactory.INSTANCE.getShape("Rectangle");
    shape2.draw();

    final Circle shape3 = ShapeFactory.INSTANCE.getShape(Circle.class);
    shape3.draw();

    final Rectangle shape4 = ShapeFactory.INSTANCE.getShape(Rectangle.class);
    shape4.draw();

    // ShapeFactory.INSTANCE.getShape(Object.class);
  }

}
