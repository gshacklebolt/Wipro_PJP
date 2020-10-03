package stream_api.assignment3;

public class Student {
	private int rollNo;
	private String name;
	private float mark;

	// Parameterized constructor
	public Student(int rollNo, String name, float mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}

	// Getters and setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	// toString method
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mark=" + mark + "]";
	}
}
