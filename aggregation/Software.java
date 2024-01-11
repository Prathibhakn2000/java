public class Software
{
 String name;
 String version;
 int releaseYear;
 
 void download() 
  {
    System.out.println("Download initiated");
  }

 void updateVersion()
  {
    System.out.println("Software updated to version");
  }
  
  Software(String name,String version,int releaseYear)
  {
	this.name=name;
    this.version=version;
    this.releaseYear=releaseYear;	
  }
}