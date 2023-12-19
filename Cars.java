public class Cars
{
///instance or class level variable
 static String brandName;
 static String colour;
 static int price;
 static byte mileage;
 static int engineCapacity;
 static byte noOfAirbags;
 static short topSeed;
 static boolean havingAc;
 
 ///constructor with parameters
  Cars(String brandName,String colour,int price,byte mileage,int engineCapacity,byte noOfAirbags,short topSeed,boolean havingAc)
 {
	this.brandName = brandName;   //initialize variables
	this.colour = colour;
	this.price = price;
	this.mileage = mileage;
	this.engineCapacity = engineCapacity;
	this.noOfAirbags = noOfAirbags;
	this.topSeed = topSeed;
	this.havingAc = havingAc;
 }
 
 public static void main(String[] args)
 {   
 
     byte value=20;
	 byte value1=2;
	 short value2=235;
     Cars obj = new Cars("BMW","blue",5380000,value,2998,value1,value2,true);
	 System.out.println("brandName:"+obj.brandName);
	 System.out.println("colour:"+obj.colour);
	 System.out.println("price:"+obj.price);
	 System.out.println("mileage:"+obj.mileage);
	 System.out.println("engineCapacity:"+obj.engineCapacity);
	 System.out.println("noOfAirbags:"+obj.noOfAirbags);
	 System.out.println("topSeed:"+obj.topSeed);
	 System.out.println("havingAc:"+obj.havingAc);
	 
	 System.out.println("..........................");
	 
	 byte val1=18;
	 byte val2=8;
	 short val3=155;
	 Cars obj1 = new Cars("Audi","black",4277000,val1,1984,val2,val3,true);
	 System.out.println("brandName:"+obj1.brandName);
	 System.out.println("colour:"+obj1.colour);
	 System.out.println("price:"+obj1.price);
	 System.out.println("mileage:"+obj1.mileage);
	 System.out.println("engineCapacity:"+obj1.engineCapacity);
	 System.out.println("noOfAirbags:"+obj1.noOfAirbags);
	 System.out.println("topSeed:"+obj1.topSeed);
	 System.out.println("havingAc:"+obj1.havingAc);
	 
	 System.out.println("..........................");
	 
	 byte val4=20;
	 byte val5=6;
	 short val6=185;
	 Cars obj2 = new Cars("Hyundai","red",1087000,val4,1197,val5,val6,true);
	 System.out.println("brandName:"+obj2.brandName);
	 System.out.println("colour:"+obj2.colour);
	 System.out.println("price:"+obj2.price);
	 System.out.println("mileage:"+obj2.mileage);
	 System.out.println("engineCapacity:"+obj2.engineCapacity);
	 System.out.println("noOfAirbags:"+obj2.noOfAirbags);
	 System.out.println("topSeed:"+obj2.topSeed);
	 System.out.println("havingAc:"+obj2.havingAc);
	 
	 System.out.println("..........................");
	 
     byte val7=10;
	 byte val8=7;
	 short val9=190;
     Cars obj3 = new Cars("Fortuner","black",3343000,val7,2755,val8,val9,true);
	 System.out.println("brandName:"+obj3.brandName);
	 System.out.println("colour:"+obj3.colour);
	 System.out.println("price:"+obj3.price);
	 System.out.println("mileage:"+obj3.mileage);
	 System.out.println("engineCapacity:"+obj3.engineCapacity);
	 System.out.println("noOfAirbags:"+obj3.noOfAirbags);
	 System.out.println("topSeed:"+obj3.topSeed);
	 System.out.println("havingAc:"+obj3.havingAc);
	 
	 System.out.println("..........................");
	 
	 byte value4=12;
	 byte value5=7;
	 short value6=170;
     Cars obj4 = new Cars("InnovaCrysta","white",1999000,value4,2393,value5,value6,true);
	 System.out.println("brandName:"+obj4.brandName);
	 System.out.println("colour:"+obj4.colour);
	 System.out.println("price:"+obj4.price);
	 System.out.println("mileage:"+obj4.mileage);
	 System.out.println("engineCapacity:"+obj4.engineCapacity);
	 System.out.println("noOfAirbags:"+obj4.noOfAirbags);
	 System.out.println("topSeed:"+obj4.topSeed);
	 System.out.println("havingAc:"+obj4.havingAc);
	 
	 
 }
}
 