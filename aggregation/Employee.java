public class Employee 
{
 String empName;
 int empId;
 
 void work()
 {
  System.out.println("employee working");
 }
 
 void completeTask()
 {
  System.out.println("task completed");
 }
 
 
 Employee(String empName,int empId)
 {
	this.empName=empName;
    this.empId=empId;	
 }
}