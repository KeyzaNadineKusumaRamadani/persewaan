package PERSEWAAN;
//super class
public class CD extends Product {
   private String artist;
   private int totalSong;
   private String label;

   public String getArtist() {
      return this.artist;
   }

   public void setArtist(String artist) {
      this.artist = artist;
   }

   public int getTotalSong() {
      return this.totalSong;
   }

   public void setTotalSong(int totalSong) {
      this.totalSong = totalSong;
   }

   public String getLabel() {
      return this.label;
   }

   public void setLabel(String label) {
      this.label = label;
   }

     public CD() {
      super.print();
        number = 10;
        name= "selamat siang";
        quantity = 0;
        artist = "aksa";
        totalSong = 0;
        label = "Sony Music";
        price = 120.0;

     }
     public CD ( int number, String name, int quantity, String artist, int totalSong, String label,double price ){
      this.number = number;
      this.name = name;
      this.quantity = quantity;
      this.artist = artist;
      this.totalSong = totalSong;
      this.label = label;
      this.price = price;
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

