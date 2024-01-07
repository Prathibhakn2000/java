public class  Sunglasses
 {  
 String brand;
 String frame_color;
 String lens_color;
 String frame_material;
 int uv_protection;
  int price;
  
  void  put_on()
  {
   System.out.println("You put on the sunglasses with lenses");
  }
  
  void block_uv()
  {
  System.out.println("The  sunglasses block harmful UV rays with  protection");
  }
  
  Sunglasses(String brand,String frame_color,String lens_color,String frame_material,int uv_protection,int price)
  {
    this.brand=brand;
	this.frame_color=frame_color;
	this.lens_color=lens_color;
	this.frame_material=frame_material;
	this.uv_protection=uv_protection;
	this.price=price;
  }
  
  public static void main(String[] args)
  {
   Sunglasses glasses = new Sunglasses("Ray-Ban", "Black", "Green","Plastic", 100,1500);
   glasses.put_on();
   glasses.block_uv();
  }
  }
  