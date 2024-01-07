public class Dog
{
    String name;
    String breed;
    int age;
    String color;
    int weight;
    boolean is_barking;
	
	void brak()
	{
	  System.out.println("Dog is barking");
	}
	
	void eat()
	{
	  System.out.println("Dog is eating");
	}
	
	void sleep()
	{
	  System.out.println("Dog is sleeping");
	}
	
	Dog(String name,String breed,int age,String color,int weight,boolean is_barking)
	{
	  this.name=name;
	  this.breed=breed;
	  this.age=age;
	  this.color=color;
	  this.weight=weight;
	  this.is_barking=is_barking;
	}
	
	public static void main(String[]args)
	{
	  Dog dog = new Dog("pummy","swizzy",2,"white",5,true);
	  dog.brak();
	  dog.eat();
	  dog.sleep();
	}

}