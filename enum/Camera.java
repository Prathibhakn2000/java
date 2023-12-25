public class Camera
{
 String brandName;
 int price;
 int resolution;
 CameraType type;
 CameraBatteryType batteryType;
 CameraChargingType chargingType;
 CameraDisplayType displayType;
 int modelYear;
 String[] features;
 

 Camera()
 {
	 System.out.println("no parametes");
 }
 
 Camera(String brandName,int price,int resolution,CameraType type,CameraBatteryType batteryType,CameraChargingType chargingType,CameraDisplayType displayType,int modelYear,String[] features)
 {
	this.brandName=brandName;
    this.price=price;
	this.type=type;
	this.batteryType=batteryType;
	this.chargingType=chargingType;
	this.displayType=displayType;
	this.modelYear=modelYear;
	this.features=features;
	
 }
 
 public void displayCameraDetails()
 {
	 System.out.println("camera brandName :"+brandName);
	 System.out.println("camera price :"+price);
	 System.out.println("camera type :"+type);
	 System.out.println("camera batteryType :"+batteryType);
	 System.out.println("camera chargingType :"+chargingType);
	 System.out.println("camera displayType :"+displayType);
	 System.out.println("camera modelYear :"+modelYear);
	 System.out.println("camera features :");
	 
	 
 }
     
}

