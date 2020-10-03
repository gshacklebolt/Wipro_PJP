
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	//Parameterized Constructor
	Book(String name, String authorName,String authorEmail, char authorGender, double price,int qtyInStock){
		this.name=name;
		this.author=new Author(authorName,authorEmail,authorGender);
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	//Getters and Setters for all the member variables
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock=qtyInStock;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	//Method to print details of the book(including the author)
	public void printBookDetails() {
		System.out.println("Name of Book: "+getName());
		System.out.println("Price: Rs "+getPrice());
		System.out.println("Quantity in Stock: "+getQtyInStock());
		System.out.println("Name of Author: "+this.author.getName());
		System.out.println("Email: "+this.author.getEmail());
		System.out.println("Gender: "+this.author.getGender());
	}

	public static void main(String[] args) {
		Book obj=new Book("The Fault In Our Stars","John Green",null,'M',0,0);
		obj.author.setEmail("sparksflyup@gmail.com");
		obj.setPrice(699.99);
		obj.setQtyInStock(2000);
		
		obj.printBookDetails();
	}

}
