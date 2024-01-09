public class  Sunglasses
 {  
 String brand;
 String frameColor;
 String lensColor;
 String frameMaterial;
 int uvProtection;
  int price;
  
  void  putOn()
  {
   System.out.println("You put on the sunglasses with lenses");
  }
  
  void blockUv()
  {
  System.out.println("The  sunglasses block harmful UV rays with  protection");
  }
  
  Sunglasses(String brand,String frameColor,String lensColor,String frameMaterial,int uvProtection,int price)
  {
    this.brand=brand;
	this.frameColor=frameColor;
	this.lensColor=lensColor;
	this.frameMaterial=frameMaterial;
	this.uvProtection=uvProtection;
	this.price=price;
  }
  
  public static void main(String[] args)
  {
   Sunglasses glasses = new Sunglasses("Ray-Ban", "Black", "Green","Plastic", 100,1500);
   glasses.putOn();
   glasses.blockUv();
  }
  }
  