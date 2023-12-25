public class VariablesType
{
  static char grade='b';  // instatnce variables
  public static void main(String[] args)
  {
   read(20);
   run(3.7f);
  }
   static void read(int number)
  {
    int value=10;       // local variables
	value=67;
	grade='c';
	
	if(67>10)
	{
	 System.out.println("67 greater");
	}
	else
	{ 
	 System.out.println("10 is greater");
	}
  }
  
   static void run(float num)
  {
	System.out.println(grade);
	
  }
   
}