package in.deveshgupta.tutorials.designpatterns.collection.iterator.series;

import java.util.Iterator;

public class ArmstrongNumberIterator implements Iterator<Long> {

  public static boolean isArmstrongNumber(long n) {
    long d;
    long sum = 0;
    int l = (int) Math.log10(n) + 1;
    while (n > 0) {
      d = n % 10;
      sum = sum + (long) Math.pow(d, l);
      n = n / 10;
    }
    return sum == n;
  }

  private long exclusive;

  private long number;

  public ArmstrongNumberIterator(long exclusive) {
    this(0, exclusive);
  }

  public ArmstrongNumberIterator(long inclusive, long exclusive) {
    assert exclusive > inclusive && inclusive > 0;
    number = inclusive;
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
}
