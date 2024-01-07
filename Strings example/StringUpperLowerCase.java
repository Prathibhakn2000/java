public class StringUpperLowerCase
{
 public static void main(String[] args)
 {
  StringUpperLowerCase.change("PraTHIbha");
  
 }
 
 static void change(String value)
 {
 char[]charArr = value.toCharArray();
 
 for(int i=0; i<charArr.length; i++)
 {
 if(charArr[i]<97)
 {
 int value1 = charArr[i];       
 int reverseValue = value1 + 32;  //LowerCase
 char ch = (char)reverseValue;
 System.out.print(ch);
 }
 
 if(charArr[i]>=97)
 {
 int value1 = charArr[i];     
 int reverseValue = value1 - 32;  //UpperCase
 char ch = (char)reverseValue;
 System.out.print(ch);
 }
 }
 }
 }