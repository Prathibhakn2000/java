public class Plant
{
  String plantName;
  int height;
  byte sunLight;
  
  
  Plant(String plantName,int height,byte sunLight)
  {
	this.plantName=plantName;
    this.height=height;
    this.sunLight=sunLight;	
	
  }
  Plant()
  { 
    this("rose");
	System.out.println("No param constructor"); 
  }
  
  Plant(String plantName)
  {
	this(6);
	System.out.println("name of the plant"); 
  }
  
  Plant(int height)
  {
	this((byte)6);
	System.out.println("height of the plant");  
       
  	
  }
  
  Plant(byte sunLight)
  {
	
	System.out.println("amount of sunLight");   
  }
  
  public static void main(String[] args)
  {
	Plant plant=new Plant();
	
}
}