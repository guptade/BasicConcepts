package in.deveshgupta.tutorials.designpatterns.collection.iterator;

import java.util.Iterator;

public class PrimeNumberIterator implements Iterator<Long> {

	private long exclusive;
	private long number;

	public PrimeNumberIterator(long exclusive) {
		this(0, exclusive);
	}

	public PrimeNumberIterator(long inclusive, long exclusive) {
		assert exclusive > inclusive && inclusive > 0;
		this.exclusive = exclusive;
		this.number = inclusive;
	}

	@Override
	public boolean hasNext() {
		while (number < exclusive) {
			if (isPrime(number)) {
				return true;
			}
			number++;
		}
		return false;
	}

	@Override
	public Long next() {
		return number++;
	}

	private static boolean isPrime(long n) {
		for (long f = 2; f < n; f++) {
			if (isFactor(f, n)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isFactor(long factor, long number) {
		return number % factor == 0;
	}

}
