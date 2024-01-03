public enum DayOfWeek
{
 SUNDAY("sunday"),MONDAY("monday"),TUESDAY("tuesday"),WEDNESDAY("wednesday"),THURSDAY("thursday"),FRIDAY("friday"),SATURDAY("saturday");
  
  String value;
  
  DayOfWeek(String value) //param Constructor initialization
  {
    this.value=value;
  }
}