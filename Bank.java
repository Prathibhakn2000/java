public class Bank
{
static void createAccount()              // static methods
{
	System.out.println("Account Created");
}

static void deposite()
{
	System.out.println("Balance after deposite");
}

static void withdraw()
{
	System.out.println("Balance after withdraw");
}

static void checkBalance()
{
	System.out.println("Balance checked");
}

static void transfer()
{
	System.out.println("Transfer amount");
}

 void getBankInfo()                     // Non-static methods
{
	System.out.println("Getting bank information");
}

 void addInterest()
{
	System.out.println("interest Rate");
}

 void getAccountInfo()
{
	System.out.println("Getting account information");
}

 void addInsurance()
{
	System.out.println("Adding insurance to account");
}

 void closeAccount()
{
	System.out.println("Closing account");
}
}