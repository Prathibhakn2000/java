public class Prathi
{
  static String name;
 static int age;
  
  public static void main(String[] args)
  {
   Prathi obj = new Prathi("prathi",23);
   obj.Display();
  }
  
  Prathi(String name,int age)
  {  
	  System.out.println("2 param");
  }
  
  static void display()
  {
	  System.out.println("name "+name);
	  System.out.println("age "+age);
  }
} 

