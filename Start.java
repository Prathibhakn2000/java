public class Start{
	
  public static void main(String[] args){
	  
      System.out.println("starting");
	  insert();///invoking a method or calling
	  System.out.println("main method");
	  delete();
	  add();
	  delete();
	  remove();
	  replace();
	  add();
	  push();
	  pop();
}
    static void insert(){ /// declaring a method
	 System.out.println("insert an element");
    }
	static void delete(){
	 insert();
	 System.out.println("delete an element ");
	}
	static void add(){
	 System.out.println("adding an element");
	}
	static void remove(){
	 add();
	 System.out.println("remove an element");
	}
	static void replace(){
	  System.out.println("replace an element");
	}
	static void push(){
    System.out.println("pushing a coding");
	}
	static void pop(){
	System.out.println("pop an element");
	}
}