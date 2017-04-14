package in.deveshgupta.tutorials.designpatterns.collection.iterator.simple;

import java.util.Iterator;
import java.util.List;

public class CountryIterator implements Iterator<Country> {

  private List<Country> countries;
  private int current = -1;

  public CountryIterator(List<Country> countries) {
    this.countries = countries;
  }

  @Override
  public boolean hasNext() {
    return countries.size() > ++current;
  }

  @Override
  public Country next() {
    return countries.get(current);
  }

}
