public class Number{
  Number()
  {
  System.out.println("no parameters");
  }
  
  Number(byte num)
  {
  System.out.println("1st constructor");
  System.out.println(num);
  }
  
  Number(int num1,int num2 )
  {
  System.out.println("2nd constructor");
  System.out.println(num2);
  }
  
  Number (long num1, short num2)
  {
  System.out.println("3rd constructor");
  System.out.println(num1);
  }
  
  public static void main(String[]args)
  {
  new Number();
  byte number1=50;
  new Number(number1);
  new Number(2345,7899);
  short number2= 2342;
  new Number(23467878l,number2);
  }
}