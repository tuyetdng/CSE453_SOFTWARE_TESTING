package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Problem4 {

	@DisplayName("Test Positive number")
	@Test
	public void testPositiveNum() {
		Fibonacci f = new Fibonacci();
		assertEquals(1, f.fib(2));

	}
	@DisplayName("Test Negative number")
	@Test
	public void testNegativeNum() {
		Fibonacci f = new Fibonacci();
		assertEquals(-1, f.fib(-1));

	}
	
	@DisplayName("Test big number")
	@Test
	public void testBigNum() {
		Fibonacci f = new Fibonacci();
		assertEquals(102334155, f.fib(40));

	}

}
