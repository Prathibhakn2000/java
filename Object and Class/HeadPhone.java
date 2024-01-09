public class HeadPhone
{
String brand;
String color;
boolean wireless;
int price;
boolean isPlaying;

void playMusic()
 {
  System.out.println("playing music");
 }       
void pauseMusic()
 { 
   System.out.println("paused the music"); 
 }
void adjustVolume()
{
System.out.println("adjusting volume");
}

HeadPhone(String brand,String color,boolean wireless,int price,boolean isPlaying)
{
this.brand=brand;
this.color=color;
this.wireless=wireless;
this.price=price;
this.isPlaying=isPlaying;
}

public void headPhoneDetails()
 {
    System.out.println("phone brand:"+brand);
	System.out.println("phone color:"+color);
	System.out.println("phone wireless:"+wireless);
	System.out.println("phone price:"+price);
	System.out.println("isPlaying:"+isPlaying);
 }
 
 public static void main(String[] args)
 {
  HeadPhone headphone= new HeadPhone("sony","black",true,2600,true);
  headphone.playMusic();
  headphone.pauseMusic();
  headphone.adjustVolume();
  headphone.headPhoneDetails();
  }
  }