package in.deveshgupta.tutorials.designpatterns.collection.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements IVisitable {

	private List<Item> items;

	public Order() {
		items = new ArrayList<>();
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
		for (Item item : items) {
			item.accept(visitor);
		}

	}

	public List<Item> getItems() {
		return items;
	}

}
