public class Manager
{
 String managerName;
 double salary;
 String department;
 
  void increaseSalary() 
 {
  System.out.println("increasing salary");
 }
 
 void assignTask() 
 {
  System.out.println("assiging task");
 }
 
 Manager(String managerName,double salary,String department)
 {
	this.managerName =managerName;
    this.salary=salary;
	this.department=department;
 }
 
 
}