package list.assignment2;

public class Employee {
	private int empId;
	private String empName;
	private String email;
	private String gender;
	private float salary;
	
	public Employee(int empId, String empName, String email, String gender, float salary) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	
	public void GetEmployeeDetails() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Employee Id: "+empId+", Name: "+empName+", Email: "+email
				+", Gender: "+gender+", Salary: "+salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
