public class Jupiter
{
 Jupiter()
 {
 System.out.println(" no parameters");
 }
 
 Jupiter(long num)
 {
 System.out.println("1st contructor");
 System.out.println(num);
 }
 
 Jupiter(long num1, long num2)
 {
 System.out.println("2nd contructor");
 System.out.println(num1);
 }
 
 Jupiter(long num1, byte num2)
 {
 System.out.println("3rd contructor");
 System.out.println(num2);
 }
 
 public static void main(String[]args)
 {
 new Jupiter();
 new Jupiter(9008856432l);
 new Jupiter(9008832598l,9740462479l);
 byte num1 = 54;
 new Jupiter(2345613456l,num1);
 
 }
}
 