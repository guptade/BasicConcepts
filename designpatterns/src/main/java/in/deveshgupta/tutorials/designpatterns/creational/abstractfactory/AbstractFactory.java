package in.deveshgupta.tutorials.designpatterns.creational.abstractfactory;

import in.deveshgupta.tutorials.designpatterns.creational.factory.Shape;
import in.deveshgupta.tutorials.designpatterns.creational.factory2.Color;

public abstract class AbstractFactory {

  public abstract Color getColor(String name);

  public abstract Shape getShape(String name);

}
