public class Accounting
{
 int foundingYear;
 String headquartersLocation; 
 
 void recordTransaction() 
 {
   System.out.println("Recording a transaction ");
 }
 void calculateAverageRevenuePerEmployee()
 {
   System.out.println(" calculate average revenue per employee");
           
 }
 
 Accounting(int foundingYear,String headquartersLocation)
 {
	this.foundingYear=foundingYear;
	this.headquartersLocation=headquartersLocation;
 }
    
	
}
