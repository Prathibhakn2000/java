public class Vehicle
{
 String brandName;
 String fuelType;
 String color;
 byte milage;
 boolean isRunnig;
 
 void startEngine()
 {
  System.out.println("starts vehicle engine");
 }
 
 void stopEngine()
 {
  System.out.println("stops vehicle engine ");
 }
 
 void brake()
 {
  System.out.println("decreases vehicle speed");
 }
 
 void consumeFuel()
 {
  System.out.println("vehicle consume some amount of Fuel");
 }
 
}