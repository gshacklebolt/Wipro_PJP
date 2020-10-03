package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 obj=new Demo2();
		assertTrue(obj.palindromeCheck("madam"));
		assertTrue(obj.palindromeCheck("mom"));
		assertTrue(obj.palindromeCheck("dad"));
		assertTrue(obj.palindromeCheck("malayalam"));
		assertFalse(obj.palindromeCheck("english"));
		assertFalse(obj.palindromeCheck("papa"));
	}

}
