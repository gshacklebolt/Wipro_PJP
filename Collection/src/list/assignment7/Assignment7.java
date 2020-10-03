package list.assignment7;

import java.util.Vector;
import java.util.Iterator;
import list.assignment2.Employee;

public class Assignment7 {

	public static void main(String[] args) {
		Vector<Employee> vc=new Vector<Employee>();
		vc.add(new Employee(1,"Ghazali","ghazali123456@gmail.com","Male",29000.0f));
		vc.add(new Employee(2,"Shristi","shristi@gmail.com","Female",15000.50f));
		vc.add(new Employee(3,"Ritu","rituraj@gmail.com","Female",90000.0f));
		vc.add(new Employee(4,"Ayush","thakurayush@gmail.com","Male",50000.0f));
		
		Iterator<Employee> itr=vc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
