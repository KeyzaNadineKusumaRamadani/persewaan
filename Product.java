package PERSEWAAN;
//super class
public class Product {
    protected int number;
    protected String name;
    protected int quantity;
    protected double price;
    
    public Product(){
        number = 0;
        name = "product 0";
        quantity = 0;
        price = 0.0;
        System.out.println("number" + number);
        System.out.println("name" + name);
        System.out.println("quantity" + quantity);
        System.out.println("price" + price);
    }
}
