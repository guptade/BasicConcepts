package in.deveshgupta.tutorials.designpatterns.creational.abstractfactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProvider.getFactory("ShapeCircleFactory1");
		factory.getShape("Circle").draw();
		factory.getColor("red").print();
	}

}
