class Fruit{
	String name;
	String taste;
	int size;
	
	Fruit(String n,String t){
		name=n;
		taste=t;
		size=0;	
	}
	
	public void eat() {
		System.out.println("Name and taste of the fruit is undefined.");
	}
}

class Apple extends Fruit{
	Apple(){
		super("Apple","Sweet");
	}
	
	public void eat() {
		System.out.println("Name: "+name+", Taste: "+taste);
	}
}

class Orange extends Fruit{
	Orange(){
		super("Orange","Sour");
	}
	
	public void eat() {
		System.out.println("Name: "+name+", Taste: "+taste);
	}
}

public class Assignment1 {
	public static void main(String[] args) {

		Fruit f=new Fruit("","");
		Apple a=new Apple();
		Orange o=new Orange();
		
		Fruit fruit;
		
		fruit=a;
		fruit.eat();
		
		fruit=o;
		fruit.eat();
		
		fruit=f;
		fruit.eat();
	}
}

