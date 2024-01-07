public class Chair
 {
 String brand;	 
 String color;                     //States
 String type;
 int price;
 static int legs;
 String material;
 
 
static void sit()                        //Behaviour
 {
  System.out.println("sitting");
 }
 
static void relax()
 {
  System.out.println("relaxing");
 }

 static void support()
 {
  System.out.println("supporting");
 }
 
 static                             //static block
 {
	legs = 4; 
 }
 
 Chair(String brand,String color,String type,int price,String material)   //contructor
 {  
    this.brand=brand;
	this.color=color;
    this.type=type;
	this.price=price;
	this.material=material;
 }
 
 public void displayDetails()
 {
	System.out.println("chair BrandName:"+brand);
	System.out.println("chair Color:"+color);
	System.out.println("chair Type:"+type);
	System.out.println("chair Price:"+price);
	System.out.println("chair Legs:"+legs);
	System.out.println("chair Material:"+material);
 }
 
 public static void main(String[] args)
 {
	Chair chair  = new Chair("SteelCase","black","Desk chair",2000,"Leather");
	Chair.sit();
	Chair.relax();
	Chair.support();
	chair.displayDetails();
    Chair.legs;
 }
 }
 


