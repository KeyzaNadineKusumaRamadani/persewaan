package PERSEWAAN;

public class DVD extends Product {
  private int length;
  private String rating;
  private String Studio;

  public int getLength() {
    return this.length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public String getRating() {
    return this.rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getStudio() {
    return this.Studio;
  }

  public void setStudio(String Studio) {
    this.Studio = Studio;
  }

  public DVD() {
    number = 10;
    name = "DVD";
    quantity = 0;
    price = 120.0;
    length = 2;
    rating = "baik";
    Studio = "DVD STUDIO";
  }

  public DVD(int number, String name, int quantity, double price, int lenght, String rating, String Studio) {
    this.number = number;
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.length = lenght;
    this.rating = rating;
    this.studio = Studio;
  }

  public void print() {
    super.print();
    System.out.println();
    System.out.println("Number :" + number);
    System.out.println("name :" + name);
    System.out.println("quantity :" + quantity);
    System.out.println("price :" + price);
    System.out.println("length :" + length);
    System.out.println("rating :" + rating);
    System.out.println("studio: " + Studio);
  }
}
