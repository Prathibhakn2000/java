public class Time
{
 Time()
 {
 System.out.println("no parameters");
 }
 
 Time(float num1)
 {
 System.out.println("1st contructor");
 System.out.println(num1);
 }
 
 Time(short num1,float num2)
 {
 System.out.println("2nd contructor");
 System.out.println(num1);
 }
 
 Time(float num1,short num2)
 {
 System.out.println("3rd contructor");
 System.out.println(num1);
 }
 
 public static void main(String[]args)
 {
 new Time();
 new Time(23.67f);
 short num1=456;
 new Time(num1,45.89f);
 short num2= 345;
 new Time(23.65f,num2);
 }
}
 