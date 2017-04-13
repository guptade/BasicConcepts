package in.devesjgupta.tutorials.designpatterns.creational.singleton;

public class LazySingleton {

	private static LazySingleton INSTANCE;

	public static LazySingleton getINSTANCE() {
		if (INSTANCE == null) {
			synchronized (LazySingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazySingleton();
				}
			}
		}
		return INSTANCE;
	}

	private LazySingleton() {
	}

	protected Object readResolve() {
		return INSTANCE;
	}

}
