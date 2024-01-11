public class Company
{
 String companyType;
 String address;
 Employee emp;
 Manager manager;
 
 void hireEmployee()
  {
   System.out.println("New employee hired");
  }
  
  void payTaxes()
  {
   System.out.println("pay all taxes");
  }
  
  Company()
  {
	  
  }
  
  Company(String companyType,String address,Employee emp,Manager manager)
  {
	this.companyType = companyType;
    this.address = address;
    this.emp = emp;
    this.manager = manager;	
  }

 
}