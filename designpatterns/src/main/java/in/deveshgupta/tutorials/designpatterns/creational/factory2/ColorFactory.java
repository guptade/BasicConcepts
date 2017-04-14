package in.deveshgupta.tutorials.designpatterns.creational.factory2;

public class ColorFactory {

  public static final ColorFactory INSTANCE = new ColorFactory();
  private final Class<? extends Color>[] classes = new Class[] {Red.class, Green.class, Blue.class};

  public <T extends Color> T getColor(Class<T> clazz) {
    if (null != clazz) {
      try {
        return clazz.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        System.err.println("unable to instantiate " + clazz);
      }
    }
    return null;
  }

  public Color getColor(String className) {
    if (null != className) {
      for (final Class<? extends Color> clazz : classes) {
        if (clazz.getSimpleName().equalsIgnoreCase(className)) {
          try {
            return clazz.newInstance();
          } catch (InstantiationException | IllegalAccessException e) {
            System.err.println("unable to instantiate " + clazz);
          }
        }
      }
    }
    return null;
  }

}
