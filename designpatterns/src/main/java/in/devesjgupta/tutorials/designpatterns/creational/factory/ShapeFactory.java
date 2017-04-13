package in.devesjgupta.tutorials.designpatterns.creational.factory;

public class ShapeFactory {

	public static final ShapeFactory INSTANCE = new ShapeFactory();
	private final Class<? extends Shape>[] classes = new Class[] { Rectangle.class, Circle.class };

	public <T extends Shape> T getShape(Class<T> clazz) {
		if (null != clazz) {
			try {
				return clazz.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				System.err.println("unable to instantiate " + clazz);
			}
		}
		return null;
	}

	public Shape getShape(String className) {
		if (null != className) {
			for (final Class<? extends Shape> clazz : classes) {
				if (clazz.getSimpleName().equals(className)) {
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
