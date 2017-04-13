package in.devesjgupta.tutorials.designpatterns.creational.factory;

public interface Shape {
	public default void draw() {
		System.out.println(getClass().getSimpleName() + " is drawing!");
	}
}
