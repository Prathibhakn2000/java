public class Computer
{
 public static void main(String[] args)
 {
   double value = Math.random();
   System.out.println(value);
   
   //double val = Math.random();
   //System.out.println(val);
   
   long addnumber = Math.addExact(1234556875l,9874567434l);
   System.out.println(addnumber);
   
   float number = Math.signum(-6.0f);
   System.out.println(number);
   
   double nextupnumber = Math.nextUp(5.0d);
   System.out.println(nextupnumber);
   
    double nextdownnumber = Math.nextDown(5.0d);
   System.out.println(nextdownnumber);
   
    int num = Math.negateExact(-258975);
   System.out.println(num);
   
   long incrementnumber = Math.incrementExact(258975348l);
   System.out.println(incrementnumber);
   
   float absnumber = Math.abs(35.987f);
   System.out.println(absnumber);
   
   
 }
}