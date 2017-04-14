package in.deveshgupta.tutorials.designpatterns.collection.visitor;

public class Item implements IVisitable {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
