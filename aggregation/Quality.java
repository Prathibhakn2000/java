public class Quality
{
  String productName;
  int productionYear;
  
  void certifyProduct() 
  {
    System.out.println( "certified");
  }
  
  void performQualityCheck()
  {
    System.out.println("Quality check performe");
  }

 Quality(String productName, int productionYear)  
 {
	this.productName = productName;
    this.productionYear	= productionYear;
 }
}
