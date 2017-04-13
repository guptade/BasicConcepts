package in.deveshgupta.tutorials.designpatterns.collection.iterator;

import java.util.Iterator;

public class ArmstrongNumberIterator implements Iterator<Long> {

	private long exclusive;
	private long number;

	public ArmstrongNumberIterator(long exclusive) {
		this(0, exclusive);
	}

	public ArmstrongNumberIterator(long inclusive, long exclusive) {
		assert exclusive > inclusive && inclusive > 0;
		this.number = inclusive;
		this.exclusive = exclusive;
	}

	@Override
	public boolean hasNext() {
		while (number < exclusive) {
			if (isArmstrongNumber(number)) {
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

	public static boolean isArmstrongNumber(long n) {
		long d;
		int l = (int) Math.log10(n) + 1;
		long sum = 0;
		while (n > 0) {
			d = n % 10;
			sum = sum + (long) Math.pow(d, l);
			n = n / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
}
