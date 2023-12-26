 public enum Payment
{
 ONLINE("online"),OFFLINE("offline");
 
 String value;
 
 Payment(String value) //param Constructor initialization
 {
	this.value=value; 
 }
}