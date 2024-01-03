public class SchoolStarter
{
 public static void main(String[] args)
 {
  School obj=new School(Result.PASS,Gender.MALE,BloodGroup.O_POSITIVE,Direction.EAST,Payment.ONLINE,DayOfWeek.MONDAY,Grade.A,Semester.SIX,WeatherCondition.SUNNY,Season.WINTER);
  obj.displayDetails();
  
  System.out.println(obj.result.value);
  System.out.println(obj.gender.value);
  System.out.println(obj.bloodGroup.value);
  System.out.println(obj.direction.value);
  System.out.println(obj.payment.value);
  System.out.println(obj.dayOfWeek.value);
  System.out.println(obj.grade.value);
  System.out.println(obj.semester.value);
  System.out.println(obj.weatherCondition.value);
  System.out.println(obj.season.value);
  
  
  if(obj.semester.value==6)
  {
	System.out.println("given semester is equal to 6");
  }
  else
  {
	System.out.println("given semester not eqaul 6");
  }
  
  if(obj.result.value=="PASS")
  {
	System.out.println("condition true");
  }
  else
  {
	System.out.println("condition false");
  }
  
  if(obj.result.value=="pass")
  {
	System.out.println("condition true");
  }
  else
  {
	System.out.println("condition false");
  }
  
  if(obj.gender.value =="MALE")
  {
	System.out.println("condition true");
  }
  else
  {
	System.out.println("condition false");
  }
  
  }
}