public class School
{
 Result result;
 Gender gender;
 BloodGroup bloodGroup;
 Direction direction;
 Payment payment;
 DayOfWeek dayOfWeek;
 Grade grade;
 Semester semester;
 WeatherCondition weatherCondition;
Season season;
 
 School(Result result,Gender gender,BloodGroup bloodGroup,Direction direction,Payment payment,DayOfWeek dayOfWeek,Grade grade,Semester semester,WeatherCondition weatherCondition,Season season)
 {
	this.result=result;
	this.gender=gender;
	this.bloodGroup=bloodGroup;
	this.direction=direction;
	this.payment=payment;
	this.dayOfWeek=dayOfWeek;
	this.grade=grade;
	this.semester=semester;
	this.weatherCondition=weatherCondition;
	this.season=season;
 }
 
 public void displayDetails()
 {
	System.out.println(result);
	System.out.println(gender);
	System.out.println(bloodGroup);
	System.out.println(direction);
	System.out.println(payment);
	System.out.println(dayOfWeek);
	System.out.println(grade);
	System.out.println(semester);
	System.out.println(weatherCondition);
	System.out.println(season);
 }
 
 
 
 
}