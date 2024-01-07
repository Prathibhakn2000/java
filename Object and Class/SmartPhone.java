public class SmartPhone
{
 String brand;
 int storage;
 String color;
 int price;
 boolean is_powered_on;
 int batteryBackup;

 void make_call()
  {
    System.out.println("Calling");
  }
  
void send_message()
 {
   System.out.println("Sending a message");
 }
 
void consumeElectricity()
{
   System.out.println("consume electricity");
} 
       
           
SmartPhone(String branf,int storage,String color,int price,boolean is_powered_on,int batteryBackup)
{
 this.brand=brand;
 this.storage=storage;
 this.color=color;
 this.price=price;
 this.is_powered_on=is_powered_on;
 this. batteryBackup=batteryBackup;
 
}
 
 public void SmartPhoneInformation()
 {
    System.out.println("phone brand:"+brand);
	System.out.println("phone storage:"+storage);
	System.out.println("phone color:"+color);
	System.out.println("phone price:"+price);
	System.out.println("is_powered_on:"+is_powered_on);
	System.out.println("phone batteryBackup:"+batteryBackup);
 }
 
 public static void main(String[] args)
 {
  SmartPhone phone = new SmartPhone("oppo",256,"black",25000,true,45375);
  phone.make_call();
  phone.send_message();
  phone.consumeElectricity();
  phone.SmartPhoneInformation();
 }
}