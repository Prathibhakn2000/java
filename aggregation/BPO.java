public class BPO extends Company
{
 double revenue;
 boolean nightShifts;
 Accounting accounting;
 Quality quality;
 
 void conductTraining()
 {
   System.out.println("Training session conducted ");
 }

 void processCall()
 {
   System.out.println("Processing a customer call ");
 }
 
 
 BPO()
 {
	 
 }
 
 BPO(double revenue,boolean nightShifts,Accounting acconting,Quality quality,String companyType,String address,Employee emp,Manager manager)
 {
	 this.revenue=revenue;
	 this.nightShifts=nightShifts;
	 this.accounting=accounting;
	 this.quality=quality;
	 this.companyType=companyType;
	 this.address=address;
	 this.emp=emp;
	 this.manager=manager;
 }

 
}