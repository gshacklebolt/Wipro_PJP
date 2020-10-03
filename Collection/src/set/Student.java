package set;

public class Student implements Comparable{
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Object obj) {
		Student student=(Student)obj;
		
		if(marks==student.marks)
			return 0;
		else if(marks>student.marks)
			return -1;
		else
			return 1;
	}
	
}
