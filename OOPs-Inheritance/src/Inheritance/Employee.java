
public class Employee extends Person {
	double annualSalary;
	int workStartYear;
	String insuranceNo;
	
	Employee(String name,double annualSalary,int workStartYear,String insuranceNo){
		super(name);
		this.annualSalary=annualSalary;
		this.workStartYear=workStartYear;
		this.insuranceNo=insuranceNo;
	}
	
	public void setEmployeeDetails(String name,double annualSalary,int workStartYear,String insuranceNo) {
		super.name=name;
		this.annualSalary=annualSalary;
		this.workStartYear=workStartYear;
		this.insuranceNo=insuranceNo;
	}
	
	public void getEmployeeDetails() {
		getPersonDetails();
		System.out.println("Annual Salary: "+this.annualSalary);
		System.out.println("Year the employee started to work: "+this.workStartYear);
		System.out.println("National Insurance Number: "+this.insuranceNo);
	}
}
