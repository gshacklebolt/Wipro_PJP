class Animal {
	
	public void eat() {
		System.out.println("I am an animal and I am eating.");
	}
	
	public void sleep() {
		System.out.println("I am an animal and I am sleeping.");
	}
}

public class Bird extends Animal {
	
	public void eat() {
		System.out.println("I am a bird and I am eating.");
	}
	
	public void sleep() {
		System.out.println("I am a bird and I am sleeping.");
	}
	
	public void fly() {
		System.out.println("I am a bird and I am flying.");
	}
	
	public static void main(String[] args) {
		Animal animal=new Animal(); //Object of Animal class
		animal.eat();
		animal.sleep();
		
		Bird bird=new Bird(); //Object of Bird class
		bird.eat(); 
		bird.sleep();
		bird.fly();
	}

}