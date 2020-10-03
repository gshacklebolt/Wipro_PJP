class Person{
	String name;
	String DateOfBirth;
	
	Person(String name, String DateOfBirth){
		this.name=name;
		this.DateOfBirth=DateOfBirth;
	}
	
	public void eat() {
		System.out.println("My name is "+name+" and I am eating");
	}
}

class Teacher extends Person{
	double salary;
	String subject;
	
	Teacher(String name, String DateOfBirth,double salary,String subject){
		super(name,DateOfBirth);
		this.salary=salary;
		this.subject=subject;
	}
	
	public void teach() {
		System.out.println("I teach "+subject);
	}
}

class Student extends Person{
	String studentId;
	Student(String name, String DateOfBirth,String studentId){
		super(name,DateOfBirth);
		this.studentId=studentId;
	}
	
	public void study() {
		System.out.println("I am a student. My student Id is: "+studentId);
	}
}

public class CollegeStudent extends Student{
	String collegeName;
	String year;
	
	CollegeStudent(String name, String DateOfBirth,String studentId,String collegeName,String year){
		super(name,DateOfBirth,studentId);
		this.collegeName=collegeName;
		this.year=year;
	}
	
	public void intro() {
		System.out.println("The name of my college is "+collegeName);
		System.out.println("I am in "+year+" year.");
	}

	public static void main(String[] args) {
		Person person=new Person("Ghazali","02/05/1997");
		person.eat();
		
		Teacher teacher=new Teacher("Rajesh Tiwari","01/01/1970",600000,"Computer Networks");
		teacher.eat();
		teacher.teach();
		
		Student student=new Student("Ghazali","02/05/1997","0502CS161020");
		student.eat();
		student.study();
		
		CollegeStudent clgStudent=new CollegeStudent("Ghazali","02/05/1997","0502CS161020","Corporate Institute of Science and Technology","fourth");
		clgStudent.eat();
		clgStudent.study();
		clgStudent.intro();
	}

}
	