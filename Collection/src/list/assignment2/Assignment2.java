package list.assignment2;

public class Assignment2 {

	public static void main(String[] args) {
		EmployeeDB obj=new EmployeeDB();
		
		//Adding employees
		obj.addEmployee(new Employee(1,"Ghazali","ghazali123456@gmail.com","Male",29000.0f));
		obj.addEmployee(new Employee(2,"Md. Kasif","kasif@gmail.com","Male",10000.0f));
		obj.addEmployee(new Employee(3,"Sujeet Sony","sujeetsomy777@gmail.com","Male",15000.0f));
		obj.addEmployee(new Employee(4,"Ajit Roy","ajit@gmail.com","Male",50000.0f));
		obj.addEmployee(new Employee(5,"Jyoti Vishwakarma","jyoti@gmail.com","Female",35000.0f));
		
		Employee[] employees=obj.showAll();
		for(Employee emp:employees) {
			emp.GetEmployeeDetails();
		}
		
		//Deleting an employee's records
		obj.deleteEmployee(4);
		System.out.println("\nDeletion Successful!\n");
		
		employees=obj.showAll();
		for(Employee emp:employees) {
			emp.GetEmployeeDetails();
		}
		
		System.out.println(obj.showPaySlip(3));
	}

}
