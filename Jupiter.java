public class Jupiter
{
 Jupiter()
 {
 System.out.println("no parameters");
 }
 
 Jupiter(long number)
 {
 System.out.println("1st contructor");
 System.out.println(number);
 }
 
 Jupiter(long number1,long number2)
 {
 System.out.println("2nd contructor");
 System.out.println(number1);
 }
 
 Jupiter(long number1,byte number2)
 {
 System.out.println("3rd contructor");
 System.out.println(number2);
 }
 
 public static void main(String[] args)
 {
 new Jupiter();
 new Jupiter(890967897867l);
 new Jupiter(9740462479l,9008832598l);
 byte num=45;
 new Jupiter(900852768l,num);
 }
 }