package in.deveshgupta.tutorials.designpatterns.collection.iterator.series;

import java.util.Iterator;

public class FibonacciNumberIterator implements Iterator<Long> {

	private long exclusive;
	private long next;
	private long prev;
	private long fib;
	boolean first;
	boolean second;

	public FibonacciNumberIterator(long exclusive) {
		assert exclusive > 2;
		this.exclusive = exclusive;
		prev = 0;
		next = 1;
		fib = 0;

	}

	@Override
	public boolean hasNext() {
		return prev + next < exclusive;
	}

	@Override
	public Long next() {
		if (!first) {
			first = true;
			return 0L;
		} else if (!second) {
			second = true;
			return 1L;
		} else {
			fib = prev + next;
			prev = next;
			next = fib;
			return fib;
		}
	}

}
