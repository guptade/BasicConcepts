package in.deveshgupta.tutorials.designpatterns.collection.iterator.simple;

public class Country {

  private String code;
  private String name;

  public Country() {
    super();
  }

  public Country(String code, String name) {
    super();
    this.code = code;
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Country [code=" + code + ", name=" + name + "]";
  }

}
