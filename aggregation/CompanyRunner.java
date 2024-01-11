public class CompanyRunner
{
public static void main(String[]args)
{
 Software software = new Software("mac os","i3",2008);
 Data data = new Data("byte",127);
 Employee emp = new Employee("Pramod",25);
 Manager manager = new Manager("Narun",100000,"softWare");
 Accounting account = new Accounting(1999,"bengaluru");
 Quality quality = new Quality("gadget",2018);
 
 IT it = new IT("Wipro",10000000,software,data,"ITcompany","Bengalauru",emp,manager);
 it.generateRevenue();
 it.software.updateVersion();
 it.emp.completeTask();
 System.out.println("companyType:"+it.companyType);
 
 IT it1 = new IT("Tech Manhindra",10000000,software,data,"ITcompany","Bengalauru",emp,manager);
 it1.data.process();
 it1.manager.increaseSalary();
 System.out.println("address:"+it1.address);
 
 System.out.println("----------------------");
 
 Company company = new Company("MNCCompany","Mangaluru",emp,manager);
 company.payTaxes();
 company.manager.assignTask();
 System.out.println("employeeName:"+company.emp.empName);
 
 Company company1 = new Company("manufacture","hasan",emp,manager);
 company1.hireEmployee();
 company1.emp.work();
 System.out.println("manager salary:"+company1.manager.salary);
 
 System.out.println("----------------------");

 BPO bpo = new BPO(234.4467628d,true,account,quality,"Infosys","bengaluru",emp,manager);
 
  if(bpo!=null)
	  if(bpo.quality!=null)
	  {
		 bpo.quality.certifyProduct() ;
      }
	System.out.println(bpo.manager.salary);
	bpo.manager.assignTask();
	
 BPO bpo1 = new BPO(564.4467628d,false,account,quality,"Wipro","mangaluru",emp,manager);
   if(bpo1!=null)
	   if(bpo1.accounting!=null)
	   {
		bpo1.accounting.calculateAverageRevenuePerEmployee();
	   }
	bpo1.quality.performQualityCheck();
    bpo1.emp.work();
	System.out.println(bpo1.nightShifts);
	
	
	
}
}