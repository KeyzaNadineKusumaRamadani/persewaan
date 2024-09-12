package PERSEWAAN;

public class DVD extends Product {
      private int length;
      private String rating;
      private String Studio;

      public DVD(){
        number= 10;
        name = "DVD";
        quantity = 0;
        price = 120.0;
        length = 2;
        rating = "baik";
        Studio = "DVD STUDIO";
      }
        public void print(){
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

