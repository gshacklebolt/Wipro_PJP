package list.assignment2;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeDB {
	ArrayList<Employee> list=new ArrayList<Employee>();
	ListIterator<Employee> lit;
	
	public boolean addEmployee(Employee e) {
		return list.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		lit=list.listIterator();
		
		while(lit.hasNext()) {
			Employee emp=lit.next();
			
			if(emp.getEmpId()==empId) {
				lit.remove();
				return true;
			}
		}
		return false;
	}
	
	public String showPaySlip(int empId) {
		String paySlip="Invalid Employee Id";
		
		for(Employee emp:list) {
			if(emp.getEmpId()==empId) {
				paySlip="Payslip for "+emp.getEmpName()+" is Rs "+emp.getSalary();
			}
		}
		return paySlip;
	}
	
	public Employee[] showAll() {
		Employee[] employees=new Employee[list.size()];
		
		for(int i=0;i<list.size();i++) {
			employees[i]=list.get(i);
		}
		return employees;
	}
}
