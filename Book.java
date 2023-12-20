public class Book
{
 String bookName;
 int noOfPages;
 String author;
 int price;
 int publishedYear;
 String publisher;
 String type;
 
Book(String bookName,int noOfPages,String author,int price,int publishedYear,String publisher,String type)
 {
    this.bookName=bookName;
	this.noOfPages=noOfPages;
	this.author=author;
	this.price=price;
	this.publishedYear=publishedYear;
	this.publisher=publisher;
	this.type=type;
 }
 
  public void printBookDetails()
 {
	System.out.println("bookName:" +this.bookName); 
	System.out.println("noOfPages:" +this.noOfPages); 
	System.out.println("author:" +this.author); 
	System.out.println("price:" +this.price); 
	System.out.println("publishedYear:" +this.publishedYear); 
	System.out.println("publisher:" +this.publisher); 
	System.out.println("type:" +this.type); 
 }
 
 public static void main(String[]args)
 {
	Book book = new Book("Beliveve in Yourself",134,"Dr.Josrph Murphy",150,1955,"AB Classics","inspiring and fascinating");
	book.printBookDetails();
	
	System.out.println("                                  ");
	Book book1 = new Book("Turning Points",192,"A.P.J Abdul Kalam",149,2014,"HarperCollins","Story");
	book1.printBookDetails();
	
	System.out.println("                                  ");
	Book book2 = new Book("Object Oriented Programming Using JAVA ",372,"K.Murugan",200,2000,"SunStar","Textbook");
	book2.printBookDetails();
	
	System.out.println("                                  ");
	Book book3 = new Book("Mookajjiya kanasugalu",192,"Shivarama Karanth",185,1968,"S.B.S Publishers","novel");
	book3.printBookDetails();
	
	System.out.println("                                  ");
	Book book4 = new Book("The Indigo Story",172,"Shelley Vishwajrrth",274,2018,"Rupa Publication","fascinating");
	book4.printBookDetails();
	
	System.out.println("                                  ");
	Book book5 = new Book("Ramayana",1700,"Valmiki",3000,1996,"Bharatiya Vidya Bhavan","Itihasa");
	book5.printBookDetails();
	
	System.out.println("                                  ");
	Book book6 = new Book("Stars shine Only In The Darkness",226,"Haris AdiWaid",165,2020,"Notion Press","Story");
	book6.printBookDetails();
 }
}