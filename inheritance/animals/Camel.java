public class Camel extends Animal
{
 int humpSize;
 boolean isDesertAnimal;
 
 Camel()
 {
	 
 }
 
  Camel(int humpSize,boolean isDesertAnimal,String speciesName,int lifeSpan,String color)
 {
      this.humpSize=humpSize;
      this.isDesertAnimal=isDesertAnimal;
      this.speciesName=speciesName;
      this.lifeSpan=lifeSpan;
      this.color=color;		  
   }
 
 
 void storeWater()
 {
  System.out.println("The camel stores water in their blood");
 }
 
 void LivesManyDaysWithoutFoodAndWater()
 {
 System.out.println("The camel lives many days in desert without food and water");
 }
}