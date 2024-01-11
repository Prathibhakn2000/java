public class IT extends Company
{
 String itCompanyName;
 int noOfEmployees;
 Software software;
 Data data;
 
 void generateRevenue()
 {
   System.out.println("Additional revenue generated");
 }

 void moveHeadquarters()
 {
   System.out.println("Headquarters moved ");
 }
 
 IT()
 {
	 
 }
 
 IT(String itCompanyName,int noOfEmployees,Software software,Data data,String companyType,String address,Employee emp,Manager manager)
  {
	this.itCompanyName = itCompanyName;
	this.noOfEmployees = noOfEmployees;
	this.software = software;
	this.data = data;
	this.companyType = companyType;
	this.address = address;
	this.emp = emp;
	this.manager = manager;
}
}