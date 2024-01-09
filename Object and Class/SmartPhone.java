public class SmartPhone
{
 String brand;
 int storage;
 String color;
 int price;
 boolean isPoweredOn;
 int batteryBackup;

 void makeCall()
  {
    System.out.println("Calling");
  }
  
void sendMessage()
 {
   System.out.println("Sending a message");
 }
 
void consumeElectricity()
{
   System.out.println("consume electricity");
} 
       
           
SmartPhone(String branf,int storage,String color,int price,boolean isPoweredOn,int batteryBackup)
{
 this.brand=brand;
 this.storage=storage;
 this.color=color;
 this.price=price;
 this.isPoweredOn=isPoweredOn;
 this. batteryBackup=batteryBackup;
 
}
 
 public void SmartPhoneInformation()
 {
    System.out.println("phone brand:"+brand);
	System.out.println("phone storage:"+storage);
	System.out.println("phone color:"+color);
	System.out.println("phone price:"+price);
	System.out.println("isPoweredOn:"+isPoweredOn);
	System.out.println("phone batteryBackup:"+batteryBackup);
 }
 
 public static void main(String[] args)
 {
  SmartPhone phone = new SmartPhone("oppo",256,"black",25000,true,45375);
  phone.makeCall();
  phone.sendMessage();
  phone.consumeElectricity();
  phone.SmartPhoneInformation();
 }
}