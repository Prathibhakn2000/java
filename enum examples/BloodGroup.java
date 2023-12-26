public enum BloodGroup
{
  A_POSITIVE("A+"),B_POSITIVE("B+"),A_NEGATIVE("A-"),B_NEGATIVE("B-"),O_POSITIVE("O+"),O_NEGATIVE("O-"),AB_POSITIVE("AB+");
  
  String value;

 BloodGroup(String value) //param Constructor initialization
 {
	this.value=value; 
 }
}

