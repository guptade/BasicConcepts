package in.deveshgupta.tutorials.designpatterns.collection.iterator.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

  private static List<Country> getCountries() {
    List<Country> countries = new ArrayList<>();
    String[] locales = Locale.getISOCountries();
    for (String countryCode : locales) {
      Locale obj = new Locale("", countryCode);
      countries.add(new Country(obj.getCountry(), obj.getDisplayCountry()));
    }
    return countries;
  }

  public static void main(String[] args) {
    CountryIterator iterator = new CountryIterator(getCountries());
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
