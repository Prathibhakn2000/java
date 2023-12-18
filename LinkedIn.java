public class LinkedIn
{
 LinkedIn()
 {
  System.out.println("no parameters");
 }
 
 LinkedIn(short num)
 {
 System.out.println("1st constuctor");
 System.out.println(num);
 }
 
 LinkedIn(byte num1,short num2)
 {
 System.out.println("2nd constuctor");
 System.out.println(num2);
 }
 
 LinkedIn(short num1,byte num2)
 {
 System.out.println("3rd constuctor");
 System.out.println(num2);
 }
 
 public static void main(String[]args)
 {
 new LinkedIn();
 short num=8768;
 new LinkedIn(num);
 short num1=678;
 byte num2=78;
 new LinkedIn(num2,num1);
 byte num3=90;
 short num4=6789;
 new LinkedIn(num4,num3);
 }
}