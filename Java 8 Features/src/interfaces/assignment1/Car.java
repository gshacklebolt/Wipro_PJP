package interfaces.assignment1;

public class Car implements Vehicle, FourWheeler {

	@Override
	public void message() {
		Vehicle.super.message();
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.message();
	}

}
