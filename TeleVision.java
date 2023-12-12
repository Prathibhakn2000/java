public class TeleVision{
  public static void main(String[]args){
  multi(2,4);
  multi(8,5);
  add(10l,30l);
  add(39,90);
  call('P');
  read(50.8f);
  learn(56789000d);
  run(true);
  run(false);
  byte value=10;
  run(value);
  short number = 100;
  walk(number);
 
  }
  static void multi(int val1,int val2){
  int multiple = val1*val2;
  System.out.println("multiple of two value is " + multiple);
  }
  
  static void add(long value1,long value2){
  long addition = value1+value2;
  System.out.println("addition of two value is " + addition);
  }
  
  static void call(char charValue){
  System.out.println("calling alphabets is " + charValue);
  }
  
  static void read(float num){
  System.out.println("number are " +num);
  }
  
  static void learn(double value){
  System.out.println("given value is " +value);
  }
  
  static void run(boolean value){
  System.out.println("task is completed? " +value);
  }

  static void walk(short val){
  System.out.println("the given number is " +val);
  }

  static void run(byte val){
  System.out.println("the given number is " +val);
  }
}