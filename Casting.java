public class Casting{
   public static void main(String[]args){
    
	/// Up Casting
	
    byte number = 36;
    short value = number;
	System.out.println(value);
	
	short number1 = 234;
	int value1 = number1;
	System.out.println(value1);
	
	int number2 = 123456783;
	long value2 = number2;
	System.out.println(value2);
	
	float num = 23.4245f;
	double val = num;
	System.out.println(val);
	
	char val1 ='P';
	int num1 = val1;
	System.out.println(num1);
	
	// Down Castig
	
	long number3 = 9008832598l;
	int value3 =(int) number3;
	System.out.println(value3);
	
	int number4 = 345883259;
	short value4 =(short) number4;
	System.out.println(value4);
	
	short number5 = 567;
	 byte value5 =(byte) number5;
	System.out.println(value5);
	
	double num2 = 23.4245345612d;
	float val2 =(float) num2;
	System.out.println(val2);
	
	int num3 =97;
	char val3 =(char) num3;
	System.out.println(val3);
	
	char value6 = 'p';
	int number6 = value6 - 32;
	char uppercase = (char) number6;
	System.out.println(uppercase);
	
	char value7 = 'M';
	int number7 = value7 + 32;
	char lowercase = (char) number7;
	System.out.println(lowercase);
	
	int num4 =91;
	char val4 =(char) num4;
	System.out.println(val4);
	
	
	
	}
   }