package PERSEWAAN;
//super class
public class CD extends Product {
     private String artist;
     private int totalSong;
     private String label;

     public CD() {
        number = 10;
        name= "selamat siang";
        quantity = 0;
        artist = "aksa";
        totalSong = 0;
        label = "Sony Music";

     }

     public void print(){
      System.out.println("Number :" + number);
      System.out.println("name :" + name);
      System.out.println("quantity :" + quantity);
      System.out.println("artist :" + artist);
      System.out.println("totalsong :" + totalSong);
      System.out.println("label: " + label);
     }
  }

