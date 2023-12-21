public class AirConditioner
{
 String brandName;
 float powerConsumption;
 String color;
 int price;
 boolean isItDualClimate;
 int warranty;
 
 
 AirConditioner(String brandName,float powerConsumption,String color,int price,boolean isItDualClimate,int warranty)
 {
   this( brandName,powerConsumption,color,price,isItDualClimate);
   this.warranty=warranty;
   System.out.println("6 parameters");
 }
 
 AirConditioner(String brandName,float powerConsumption,String color,int price,boolean isItDualClimate)
 {
   this(brandName,powerConsumption,color,price);
   this.isItDualClimate=isItDualClimate;
   System.out.println("5 parameters");
 }
 
 AirConditioner(String brandName,float powerConsumption,String color,int price)
 {
   this(brandName,powerConsumption,color);
   this.price=price;
   System.out.println("4 parameters");
 }
 
 AirConditioner(String brandName,float powerConsumption,String color)
 {
   this(brandName,powerConsumption);
   this.color=color;
   System.out.println("3 parameters");
 }
 
 AirConditioner(String brandName,float powerConsumption)
 {
   this(brandName);
   this.powerConsumption=powerConsumption;
   System.out.println("2 parameters");
 }
 
 AirConditioner(String brandName)
 {
   this();
   this.brandName=brandName;
   System.out.println("1 parameters");
 }
 
 AirConditioner()
 {
   System.out.println("no parameters");
 }
 
 
 
 public void display()
 {
	 System.out.println(brandName);
	 System.out.println(powerConsumption);
     System.out.println(color);
	 System.out.println(price);
	 System.out.println(isItDualClimate);
	 System.out.println(warranty);
 }
 }
 