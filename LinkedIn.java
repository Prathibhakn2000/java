public class LinkedIn
{
 LinkedIn()
 {
 System.out.println(" no parameters");
 }
 LinkedIn(int num)
 {
 System.out.println("1st contructor");
 System.out.println(num);
 }
 LinkedIn(float num1, double num2)
 {
 System.out.println("2nd contructor");
 System.out.println(num1);
 }
 
 LinkedIn(double num1,Float num2)
 {
 System.out.println("3rd contructor");
 System.out.println(num1);
 }
 
 public static void main(String[]args)
 {
 new LinkedIn();
 new LinkedIn(12356);
 new LinkedIn(56.8f,45.784567d);
 new LinkedIn(55.745648d,68.90f);
 }
}
 