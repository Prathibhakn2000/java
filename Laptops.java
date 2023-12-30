public class Laptops
{ 
 String brandName;
 int price;
 static String operatingSystem;
 static boolean hasTouchScreen;
 static String processorType;
 double screenSize;
 int stroageCapacity;
 
 Laptops(String brandName,int price,double screenSize,int stroageCapacity) //init non-static variables using constructor
 {
	 this.brandName=brandName;
	 this.price=price;
	 this.screenSize=screenSize;
	 this.stroageCapacity=stroageCapacity;
 }
 
 static                                                                   // init static variables using static_block
 {
	operatingSystem = "windows";
	hasTouchScreen = false;
	processorType = "Intel";
 }
 
/* public void display()
  { 
    System.out.println(brandName);
	System.out.println(price);
	System.out.println(operatingSystem);
	System.out.println(hasTouchScreen);
	System.out.println(processorType);
	System.out.println(screenSize);
	System.out.println(stroageCapacity);
	  
  }
 
 
   public static void main (String[] args)
 {
	 Laptops obj = new Laptops("HP",22455,12.45,256);
	 obj.display();
	 
	 Laptops.processorType = "AMD";
	 
	  Laptops obj1 = new Laptops("Lenovo",22435,67.45,256);
	 obj1.display();
	 
	 
 }*/

 
}