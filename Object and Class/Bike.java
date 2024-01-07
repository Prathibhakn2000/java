public class Bike
{
 String brand;                                                   // states
 String model;
 String color;
 int price;
 int noWheel;
 int gearType;
 
 
 void start()
 {
  System.out.println("Bike is now starting");
 }
 
 void brake()
 {
  System.out.println("Bike is now stop");
 }
 
 void accelerate()
 {
  System.out.println("Bike is now moving");
 }
 
 Bike(String brand,String model,String color,int price,int noWheel,int gearType)
 {
   this.brand=brand;
   this.model=model;
   this.color=color;
   this.price=price;
   this.noWheel=noWheel;
   this.gearType=gearType;
 }
 public static void main(String[] args)
 { 
   Bike bike = new Bike("Trek","Mountain Bike","Green",60000,2,4);
   bike.start();
   bike.brake();
   bike.accelerate();
   
 }
}