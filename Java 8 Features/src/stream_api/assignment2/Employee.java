package stream_api.assignment2;

public class Employee {
	private int empNo;
	private String name;
	private int age;
	private String location;

	// Parameterized constructor
	public Employee(int empNo, String name, int age, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	// Getters and setters
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}

}
