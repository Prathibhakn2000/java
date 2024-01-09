public class Umbrella
{
String color;
int size;
String material;
boolean isFoldable;
String brand;
int price;

void open()
{ 
 System.out.println("Umbrella is open now");
}

void close()
{ 
 System.out.println("Umbrella is close now");
}

void checkWeather()
{ 
 System.out.println("Umbrella is suitable for all conditions");
}

Umbrella(String color,int size,String material,boolean isFoldable,String brand,int price)
{
 this.color=color;
 this.size=size;
 this.material=material;
 this.is_foldable=isFoldable;
 this.brand=brand;
 this.price=price;
}
 
 public void UmbrellaInformation()
 {
    System.out.println("Umbrella color:"+color );
	System.out.println("Umbrella size:"+size);
	System.out.println("Umbrella material:"+material);
	System.out.println("Umbrella is_foldable:"+isFoldable);
	System.out.println("Umbrella brand:"+brand);
	System.out.println("Umbrella price:"+price);
 }
 
 public static void main(String[] args)
 {
  Umbrella umbrella = new Umbrella("black",33,"rayon",true,"Rylan",250);
  umbrella.open();
  umbrella.close();
  umbrella.checkWeather();
  umbrella.UmbrellaInformation();
 }
}