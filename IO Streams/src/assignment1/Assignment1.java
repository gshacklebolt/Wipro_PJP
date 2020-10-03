package assignment1;

import java.util.Date;
import java.io.*;

public class Assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		Employee emp=new Employee("Ghazali",new Date("05/02/1997"),"Software Development","Project Engineer",350004);
		
		//Object Serialization
		try {
			FileOutputStream fos=new FileOutputStream("data");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			
			fos.close();
			oos.flush();
			oos.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			
		}
		catch(Exception e) {
			System.out.println("Exception during serialization: "+e);
			System.exit(0);
		}
		
		//Object Deserialization
		Employee obj=null;
		try {
			FileInputStream fis=new FileInputStream("data");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			obj=(Employee)ois.readObject();
			
			fis.close();
			ois.close();
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Deserialization :-");
		System.out.println("Name: "+obj.getName());
		System.out.println("DOB: "+obj.getDateOfBirth());
		System.out.println("Department: "+obj.getDepartment());
		System.out.println("Designation"+obj.getDesignation());
		System.out.println("Salary: Rs "+obj.getSalary());
	}

}
