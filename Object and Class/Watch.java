public class Watch
{
String color;
String material;
boolean isRunning;
String brand;
int price;

void showingtime()
{ 
 System.out.println("Watch shows time");
}

void cossumeSpace()
{ 
 System.out.println("watch occupied some space");
}



Watch(String color,String material,boolean isRuuning,String brand,int price)
{
 this.color=color;
 this.material=material;
 this.is_running=isRunning;
 this.brand=brand;
 this.price=price;
}
 
 public void watchDetails()
 {
    System.out.println("Watch color:"+color );
	System.out.println("Watch material:"+material);
	System.out.println("Watch is_ruuning:"+isRunning);
	System.out.println("Watch brand:"+brand);
	System.out.println("Watch price:"+price);
 }
 
 public static void main(String[] args)
 {
  Watch watch = new Watch("black","Carbon",true,"Titan",2500);
  watch.showingtime();
  watch.cossumeSpace();
  watch.watchDetails();
 }
}