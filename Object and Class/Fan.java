public class Fan
{
 String brand;                                                   // states
 String type;
 String color;
 int price;
 int speed;
 int wings;
 
 void on()                                                       // behaviour
 {
 System.out.println("Fan on");
 }
 
  void speedChange()
 {
 System.out.println("Fan speed changed");
 }
 
  void givesAir()
 {
 System.out.println("Fan gives air");
 }
 
  void cosumeElectricity()
 {
 System.out.println("Fan consume some electricity");
 }
 
 Fan(String brand,String type,String color,int price,int speed,int wings) //constructor
 { 
  this.brand=brand;
  this.type=type;
  this.color=color;
  this.price=price;
  this.speed=speed;
  this.wings=wings;
 }
 
 public void fanInformation()
 {
    System.out.println("Fan Brand :"+brand);
	System.out.println("Fan Type:"+type);
	System.out.println("Fan color:"+color);
	System.out.println("Fan Price:"+price);
	System.out.println("Fan speed:"+speed);
	System.out.println("Fan Wings:"+wings);
 }
 
 public static void main(String[]args)
 {
 Fan fan = new Fan("Bajaj","Table Fan","White",60000,3,4);
 fan.on();
 fan.speedChange();
 fan.givesAir();
 fan.cosumeElectricity();
 fan.fanInformation();
 
 }

}