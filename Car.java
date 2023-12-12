public class Car
  {
   public static void main(String[]args)
   {
   walk(10);
   byte value=30;
   walk(value);
   walk(39.6f);
   
   multi(2.4f,9.6f,34.8f);
   multi(12.4f,3.6f);
   multi(45.4f,6.6f,23.9f,7.8f);
   
   short num = 546;
   sum(12234l,num,23.7f);
   short num1 = 456;
   sum(45.7f, 34562l,num1);
   short nbr = 786;
   sum(3425678l,67.3f,nbr);
   
   }
   
   static void walk(int number)
   {
   System.out.println("1st method");
   System.out.println(number);
   }
   
   static void walk(float number)
   {
   System.out.println("2nd method");
   System.out.println(number);
   }
   
   static void walk(byte number)
   {
   System.out.println("3rd method");
   System.out.println(number);
   }
   
   
   static void multi(float val1,float val2)
   {
    float multiply = val1*val2;
	System.out.println("1st method");
    System.out.println(multiply);
   }
   
   static void multi(float val1,float val2,float val3,float val4)
   {
    float multiply = val1*val2*val3*val4;
	System.out.println("2nd method");
    System.out.println(multiply);
   }
   
   static void multi(float val1,float val2,float val3)
   {
    float multiply = val1*val2*val3;
	System.out.println("3rd method");
    System.out.println(multiply);
   }
   
   
   static void sum(float num1,long num2,short num3)
   {
	System.out.println("1st method");  
   }
  
   
   static void sum(long num1,short num2,float num3)
   {
	System.out.println("2nd method");  
   }
   
   
   static void sum(long num1,float num2,short num3)
   {
	System.out.println("3rd method");  
   }
   }
  