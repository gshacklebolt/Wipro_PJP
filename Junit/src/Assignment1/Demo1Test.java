package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void testStringConcat() {
		Demo1 obj=new Demo1();
		assertEquals("HelloWorld",obj.stringConcat("Hello", "World"));
		assertEquals("JavaProgram",obj.stringConcat("Java", "Program"));
	}

}
