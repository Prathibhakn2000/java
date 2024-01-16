public class AnimalRunner
{
 public static void main(String[] args)
 {
  Tiger tiger = new Tiger("hunt",true,true,"tig",50,"orange");
  System.out.println(tiger.lifeSpan);
  System.out.println(tiger.color);
  tiger.makeSound();
 }
}