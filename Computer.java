public class Computer{
  public static void main(String[] args){
      System.out.println("starting");
	  push();
	  System.out.println("main method");
	 }
    static void execute(){
	 System.out.println("execute method");
	
	}
	static void push(){
	 execute();
	 System.out.println("pushing the code ");
	}
 

}