package in.deveshgupta.tutorials.designpatterns.creational.abstractfactory;

public class FactoryProvider {

  private static final Class<? extends AbstractFactory>[] FACTORIES =
      new Class[] {ShapeCircleFactory1.class,};

  public static AbstractFactory getFactory(String name) {
    if (null != name) {
      for (Class<? extends AbstractFactory> clazz : FACTORIES) {
        if (clazz.getSimpleName().equals(name)) {
          try {
            return clazz.newInstance();
          } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
          }
        }
      }
    }
    return null;
  }

  private FactoryProvider() {
    throw new AssertionError("No FactoryProvider object for you");
  }

}
