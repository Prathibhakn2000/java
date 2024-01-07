public class StringReverse
{
 public static void main(String[]args)
 {
	 String str = "Prathibha";                          // reverse a string
     char[] charArray = str.toCharArray();
	 System.out.println(charArray);
	 
	 for(int i=charArray.length-1; i>=0; i--)
	 {
		 System.out.println(charArray[i]);
	 }
	 
	 
  }
    
 
}