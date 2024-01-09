public class StringLowerCase
{
 public static void main(String[] args)
 {
 String value = "PRATHIBHA";
  StringLowerCase.change(value);
 
 }
 
 static void change(String value)
 {
 char[]charArr = value.toCharArray();
 
 for(int i=0; i<charArr.length; i++)
 {
 int value1 = charArr[i];
 int reverseValue = value1 + 32;
 char ch = (char)reverseValue;
 System.out.print(ch);
}
}
}