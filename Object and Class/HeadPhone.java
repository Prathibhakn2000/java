public class HeadPhone
{
String brand;
String color;
boolean wireless;
int price;
boolean is_playing;

void play_music()
 {
  System.out.println("playing music");
 }       
void pause_music()
 { 
   System.out.println("paused the music"); 
 }
void adjust_volume()
{
System.out.println("adjusting volume");
}

HeadPhone(String brand,String color,boolean wireless,int price,boolean is_playing)
{
this.brand=brand;
this.color=color;
this.wireless=wireless;
this.price=price;
this.is_playing=is_playing;
}

public void headPhoneDetails()
 {
    System.out.println("phone brand:"+brand);
	System.out.println("phone color:"+color);
	System.out.println("phone wireless:"+wireless);
	System.out.println("phone price:"+price);
	System.out.println("is_playing:"+is_playing);
 }
 
 public static void main(String[] args)
 {
  HeadPhone headphone= new HeadPhone("sony","black",true,2600,true);
  headphone.play_music();
  headphone.pause_music();
  headphone.adjust_volume();
  headphone.headPhoneDetails();
  }
  }