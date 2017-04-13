package in.deveshgupta.tutorials.designpatterns.creational.abstractfactory;

import in.deveshgupta.tutorials.designpatterns.creational.factory.Shape;
import in.deveshgupta.tutorials.designpatterns.creational.factory.ShapeFactory;
import in.deveshgupta.tutorials.designpatterns.creational.factory2.Color;
import in.deveshgupta.tutorials.designpatterns.creational.factory2.ColorFactory;

public final class ShapeCircleFactory1 extends AbstractFactory {

	@Override
	public Color getColor(String name) {
		return ColorFactory.INSTANCE.getColor(name);
	}

	@Override
	public Shape getShape(String name) {
		return ShapeFactory.INSTANCE.getShape(name);
	}

}
