package in.deveshgupta.tutorials.designpatterns.collection.iterator.series;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    Iterator<Long> iterator;
    // iterator = new ArmstrongNumberIterator(1000, 10000);
    // iterator = new PrimeNumberIterator(1000);
    iterator = new FibonacciNumberIterator(1000);

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
