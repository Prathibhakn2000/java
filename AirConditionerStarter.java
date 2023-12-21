public class AirConditionerStarter
{
  public static void main(String[] args)
  {
    AirConditioner AC = new AirConditioner("Daikin",1.5f,"red",45000,true,3);
	AC.display();
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
	AirConditioner AC1 = new AirConditioner("Voltas",1.5f,"black",55000,true);
	AC1.display();
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
	AirConditioner AC2 = new AirConditioner("BlueStar",1.0f,"grey",50000);
	AC2.display();
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
	AirConditioner AC3 = new AirConditioner("Haier",9.5f,"white");
	AC3.display();
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
	AirConditioner AC4 = new AirConditioner("Godrej",1.0f);
	AC4.display();
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
	AirConditioner AC5 = new AirConditioner("Samsung AC");
	AC5.display();
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
	AirConditioner AC6 = new AirConditioner();
	AC6.display();
	 }
  }
