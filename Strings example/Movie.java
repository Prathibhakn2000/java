public class Movie
{
  public static void main(String[] args)
  {
	
   
   String str = "" ;
   if(str!=null)          // null check
   {
   boolean value = str.isEmpty(); // it returns true if length is 0,otherwise returns false
   System.out.println(value);
   }
  
  
  String str1 = "Programming Language"; //it removes the whiteSpace (first and last)
  String trimvalue = str1.trim();
  System.out.println(trimvalue);
  
  
  String val = String.valueOf('p'); //it returns string represantion of char arguement
   System.out.println(val);
  
  
  String str2 = "Prathibha";
  String substringvalue = str2.substring(3,7); //Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
  System.out.println(substringvalue);
  
  
  String substringvalue1 = str2.substring(3);
  System.out.println(substringvalue1);
  
  
  String str3 = "Bachelore Of Science";
  String replacevalue = str3.replaceFirst("Bachelore","Master"); //Replaces the first substring of this string that matches the given regular expression with the given replacement.
  System.out.println(replacevalue);
  
  String str4 = "prathi";
  boolean equalsIgnorevalue = str4.equalsIgnoreCase("pramod");
  System.out.println(equalsIgnorevalue);
  
  
  boolean endsvalue = str4.endsWith("u");
  System.out.println(endsvalue);
  
  boolean startsvalue = str4.startsWith("p");
  System.out.println(startsvalue);
  
  
  String str5 = "KARNATAKA";
  String lowerCaseValue = str5.toLowerCase();
  System.out.println(lowerCaseValue);
  
  String str6 = "india";
  String upperCaseValue = str6.toUpperCase();
  System.out.println(upperCaseValue);
  
  }
}