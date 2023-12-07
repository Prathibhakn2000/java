public class Laptop{
 
  public static void main(String[] args){
  
  int returnedValue = add();
  System.out.println(returnedValue);
  
  byte returnedNumber = read();
  System.out.println(returnedNumber);
   
  long retunedValue = watch();
  System.out.println(retunedValue);
  
  char retunedType = run();
  System.out.println(retunedType);
  
  boolean retunedCondition = write();
  System.out.println(retunedCondition);
  
  float retunedNumber = sum();
  System.out.println(retunedNumber);
  
  double retunedCreation = create();
  System.out.println(retunedCreation);
  
  short retunedMultiple = multi();
  System.out.println(retunedMultiple);
  
}
   
   static int add()
   {
    int num1 = 10;
    int num2 = 20;
    int value = num1 + num2;
    return value;
   } 
   
   static byte read()
   {
    byte number = 35;
    return number;
   }
   
   static long watch()
   {
    long value1 = 345621L;
    long value2 = 335621L;
    long value = value1+ value2;
    return value;
   }
   
   static char run()
   {
    char type = 'p';
    return type;
   }
   
   static boolean write()
   {
    boolean value = true;
	return value;
   }
   
   static float sum()
   {
	float val1 = 2.6f;
	float val2 = 9.6f;
	float value = val1*val2;
	return value;
   }
   
   static double create()
   {
	double value = 8.90963d;
	return value;
   }
   
   static short multi()
   {
	short value = 567;
	return value;
   }
}

   
   
   