public class BankStarter
{ 
 public static void main(String[] args)
 {
  Bank.createAccount();  // Invoking static method
  
  Bank.deposite();
  
  Bank.withdraw();
  
  Bank.checkBalance();
  
  Bank.transfer();
  
  Bank bank=new Bank();  
  bank.getBankInfo();       // Invoking non-static methods
  
  Bank bank1=new Bank();
  bank1.addInterest();
  
  Bank bank2=new Bank();
  bank2.getAccountInfo();
  
  Bank bank3=new Bank();
  bank3.addInsurance();
  
  Bank bank4=new Bank();
  bank4.closeAccount();
 }
}