public class Plants
{
  String plantName;
  int height;
  byte sunLight;
  
  
  Plants(String plantName,int height,byte sunLight)
  {
	this.plantName=plantName;
    this.height=height;
    this.sunLight=sunLight;	
	
  }
  Plants()
  { 
    this("rose");
	System.out.println("No param constructor"); 
  }
  
  Plants(String plantName)
  {
	this(7);
	System.out.println("name of the plant:"+plantName); 
  }
  
  Plants(int height)
  {
	this((byte)6);
	System.out.println("height of the plant:"+height);  
       
  	
  }
  
  Plants(byte sunLight)
  {
	
	System.out.println("amount of sunLight:"+sunLight);   
  }
  
  public static void main(String[] args)
  {
	Plants plant=new Plants();
	
}
}