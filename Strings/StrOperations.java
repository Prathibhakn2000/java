public class StrOperations
{
 public static void main(String[]args)
 {
	 String str = "Prathibha";              // reverse a string 
	 char[] charArray = str.toCharArray();
	 System.out.println(charArray);
	 
	 for(int i=charArray.length-1; i>=0; i--)
	 {
		 System.out.println(charArray[i]);
	 }
	 
	StrOperations obj = new StrOperations();
	int occurence = obj.countOccurence(charArray,'a');
	System.out.println("Occurence of 'a' :" +occurence);
	
 }
    public int countOccurence(char[] charArray, char ch)
	{
	 
     String str1 = "Kannada";
	 char[] charArray1 = str1.toCharArray();
	 System.out.println(charArray1);
	 
	 
		int count =0;                                //finding occurence of a char in a string
		for (int i = 0; i<charArray1.length; i++)
		{
			if (charArray1[i] == ch)
			{
				count++;
			}
		}
		
	return count;
 
}
 
}