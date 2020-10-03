
public class TestEmployee {

	public static void main(String[] args) {
		Person p=new Person("Harry Potter");
		p.getPersonDetails();
		p.setPersonDetails("Harry James Potter");
		p.getPersonDetails();
		
		Employee emp=new Employee("Ghazali Ghazali",350004,2020,"");
		emp.getEmployeeDetails();
		emp.setEmployeeDetails("Ghazali",350004,2020,"UNKNOWN");
		emp.getEmployeeDetails();
	}
}
