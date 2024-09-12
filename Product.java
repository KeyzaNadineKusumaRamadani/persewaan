package PERSEWAAN;

//super class
public class Product {
    protected int number;
    protected String name;
    protected int quantity;
    protected double price;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
        number = 0;
        name = "product 0";
        quantity = 0;
        price = 0.0;
    }

    public Product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void print() {
        System.out.println("number" + number);
        System.out.println("name" + name);
        System.out.println("quantity" + quantity);
        System.out.println("price" + price);
    }
}
