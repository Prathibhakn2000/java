public class Gadget
{
String name;
String color;
boolean isWireless;
int batteryLife;
int storageCapacity;

void powerOn()
{
System.out.println("Powers on the gadget");
}

void powerOff()
{
System.out.println("Powers off the gadget");
}

void charge()
{
System.out.println("Charges the gadget if it is not currently charging or powered on");
}

void unplug()
{
System.out.println("Unplugs the gadget from the charger if it is currently charging");
}
}


