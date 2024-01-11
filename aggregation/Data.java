public class Data
{
 String dataType;
 int dataSize;
 
 void encrypt()
 {
  System.out.println("encrypt");
 }
 
 void process()
 {
  System.out.println("process");
 }
 
 Data(String dataType,int dataSize)
 {
	 this.dataType=dataType;
	 this.dataSize=dataSize;
	 
 }
}