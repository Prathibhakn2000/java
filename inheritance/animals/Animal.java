public class Animal
{
 String speciesName;
 int lifeSpan;
 String color;
 
 
 Animal()
 {
	 
 }
 
  Animal(String speciesName,int lifeSpan,String color)
 {
  this.speciesName=speciesName;
  this.lifeSpan=lifeSpan;
  this.color=color;	
 }
 
 
 
 
 
 void eat()
 {
  System.out.println("Animals are eat");
 }
 
 void sleep()
 {
  System.out.println("Animals are sleep");
 }
 
 void makeSound()
 {
  System.out.println("Animals make sound");
 }
 
 void walk()
 {
  System.out.println("Animals are walk");
 }
 
}