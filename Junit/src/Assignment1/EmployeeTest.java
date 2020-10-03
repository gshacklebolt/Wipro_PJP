package Assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

public class EmployeeTest {
	ArrayList<String> arr;
	
	@Before
	public void before() {
		arr=new ArrayList<String>();
		
		arr.add("Bengaluru");
		arr.add("Pune");
		arr.add("Mumbai");
	}
	
	@Test
	public void testFindName() {
		
		Employee emp=new Employee();
		assertEquals("FOUND",emp.findName(arr, "Pune"));
		assertEquals("FOUND",emp.findName(arr, "Bengaluru"));
		assertEquals("FOUND",emp.findName(arr, "Mumbai"));
		assertEquals("NOT FOUND",emp.findName(arr, "Wipro"));
		assertEquals("NOT FOUND",emp.findName(arr, "Karnataka"));
	}

}
