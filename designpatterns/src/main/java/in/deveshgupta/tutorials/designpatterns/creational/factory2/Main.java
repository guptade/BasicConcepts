package in.deveshgupta.tutorials.designpatterns.creational.factory2;

public class Main {

	public static void main(String[] args) {
		final String redColor = Red.class.getSimpleName();
		final Color color = ColorFactory.INSTANCE.getColor(redColor);
		color.print();

		final Color color2 = ColorFactory.INSTANCE.getColor("blue");
		color2.print();

		final Red red = ColorFactory.INSTANCE.getColor(Red.class);
		red.print();

		final Blue blue = ColorFactory.INSTANCE.getColor(Blue.class);
		blue.print();

		// ColorFactory.INSTANCE.getColor(Object.class);
	}

}
