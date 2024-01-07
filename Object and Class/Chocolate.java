public class Chocolate
{
  String brand;
  String flavor;
  String weight;
  String cocoa_content;
  boolean is_milk_chocolate;
  int price;
  
  void unwrap()
  {
    System.out.println("Chocolate  is unwrapped and ready to be enjoyed.");
  }
  
  void eat()
  {
    System.out.println("You take a bite of the chocolate, It's delicious!");
  }
  
  Chocolate(String brand,String flavor,String weight,String cocoa_content,boolean is_milk_chocolate,int price)
  {
   this.brand=brand;
   this.flavor=flavor;
   this.weight=weight;
   this.cocoa_content=cocoa_content;
   this.is_milk_chocolate=is_milk_chocolate;
   this.price=price;
  }
  
  public static void main(String[]args)
  {
  Chocolate chocolate=new Chocolate("Lindt","Dark","100g","70%",false,5);
  chocolate.unwrap();
  chocolate.eat();
  } 
}
  
    
        