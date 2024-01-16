public class Tiger extends Animal
{
 String habitat;
 boolean isHungry;
 boolean isSymobolOfPower;
 
 Tiger()
 {
	 
 }
 
  Tiger(String habitat,boolean isHungry,boolean isSymobolOfPower,String speciesName,int lifeSpan,String color)
 
  {
	  this.habitat=habitat;
      this.isHungry=isHungry;
      this.isSymobolOfPower=isSymobolOfPower;
      this.speciesName=speciesName;
      this.lifeSpan=lifeSpan;
      this.color=color;		  
   }
 
 
 void roar()
 {
  System.out.println("The tiger roars loudly");
 }
 
 void swimming()
 {
 System.out.println("The tiger loves water and enjoying swimming");
 }
}
