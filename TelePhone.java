public class TelePhone
{
 TelePhone()
 {
 System.out.println(" no parameters");
 }
 
 TelePhone(short num)
 {
 System.out.println("1st contructor");
 System.out.println(num);
 }
 
 TelePhone(int num1, double num2)
 {
 System.out.println("2nd contructor");
 System.out.println(num1);
 }
 
 TelePhone(double num1,int num2)
 {
 System.out.println("3rd contructor");
 System.out.println(num1);
 }
 
 public static void main(String[]args)
 {
 new TelePhone();
 short number1=234;
 new TelePhone(number1);
 new TelePhone(234561,45.784567d);
 new TelePhone(55.745648d,345678);
 }
}
 