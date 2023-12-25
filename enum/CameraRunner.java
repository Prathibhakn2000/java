public class CameraRunner
{
  public static void main(String[] args)
  {
	  String[] features ={"Aperture","Resolution","Shutter Speed","Image Stabilization","RAW Format","HDR"};
   
   Camera camera = new Camera("Canon",50000,2184,CameraType.DSLR,CameraBatteryType.AA,CameraChargingType.WIRELESS,CameraDisplayType.TOUCHSCREEN,2009,features);
   camera.displayCameraDetails();
   for(int i=0;i<features.length;i++)
   {
	System.out.println("features:"+features[i]);   
   }
   
   System.out.println("                                         ");
   Camera camera1 = new Camera("Nikon",60000,5167,CameraType.MIRRORLESSCAMERA,CameraBatteryType.SONY,CameraChargingType.USBC,CameraDisplayType.LCD,2010,features);
   camera1.displayCameraDetails();
   for(int i=0;i<features.length;i++)
   {
	System.out.println("features:"+features[i]);   
   }
   
   System.out.println("                                         ");
   Camera camera2 = new Camera("Sony",55000,3456,CameraType.DIGITALCAMERA,CameraBatteryType.CR123A,CameraChargingType.MICROUSB,CameraDisplayType.OLED,2018,features);
   camera2.displayCameraDetails();
   for(int i=0;i<features.length;i++)
   {
	System.out.println("features:"+features[i]);   
   }
   
   System.out.println("                                         ");
   Camera camera3 = new Camera("Panasonic",45000,2312,CameraType.FILMCAMERA,CameraBatteryType.ALKALINE,CameraChargingType.LIGHTNING,CameraDisplayType.ELECTRONICVIEWFINDER,2008,features);
   camera3.displayCameraDetails();
   for(int i=0;i<features.length;i++)
   {
	System.out.println("features:"+features[i]);   
   }
   
   System.out.println("                                         ");
   Camera camera4 = new Camera("Fujifilm",70000,5134,CameraType.BRIDGECAMERA,CameraBatteryType.LITHIUMION,CameraChargingType.AABATTERIES,CameraDisplayType.OPTICALVIEWFINDER,2015,features);
   camera4.displayCameraDetails();
   for(int i=0;i<features.length;i++)
   {
	System.out.println("features:"+features[i]);
   }
   
   System.out.println("                                         ");
   Camera camera5 = new Camera("Olympus",66000,6897,CameraType.ACTIONCAMERA,CameraBatteryType.AAA,CameraChargingType.CR123ABATTERIES,CameraDisplayType.FLIPOUTSCREEN,2019,features);
   camera5.displayCameraDetails();
   for(int i=0;i<features.length;i++)
   {
	System.out.println("features:"+features[i]);   
   }
  
  
   
     switch(camera5.type)
   {
	case MIRRORLESSCAMERA:
	     System.out.println("camera type is MIRROR_LESS_CAMERA");
		 break;
    
	case DIGITALCAMERA:
	    System.out.println("camera type is DIGITAL_CAMERA");
		break;
		
	case FILMCAMERA:
	    System.out.println("camera type is FILM_CAMERA");
		break;
		
	case DSLR:
	    System.out.println("camera type is DSLR");
		break;
		
	case BRIDGECAMERA:
	    System.out.println("camera type is BRIDGE_CAMERA");
		break;
		
	case ACTIONCAMERA:
	    System.out.println("camera type is ACTION_CAMERA");
		break;
}
}
}
	
