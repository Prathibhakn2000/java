public class StringOccurence
{
 public static void main(String[] args)
 {
  String value = "hello";                               // fing the occurence of a string
  int occurence=StringOperation.findOccurence(value,'l');
  System.out.println(occurence);
 }
 
 static int findOccurence(String value, char ch)
 {
  int count=0;
  char[] arr = value.toCharArray();
  System.out.println(arr);
  
  for(int i=0; i<=arr.length-1; i++)
  if(arr[i]==ch)
  {
   count++;
  }
 
 return count;
}



}