package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem1 {
	Quadric_Equation qe = new Quadric_Equation();

	@DisplayName("Invalid Input - Outrange")
	@ParameterizedTest
	@CsvSource({ "-1, -1, -1", "200,201,201", "12-, 1-2-3, 12", "a, b, c", "10, 20, ' ' " })
	void test1(int a, int b, int c) {
		assertEquals("Invalid input", qe.calculateroot(a, b, c));
	}

	@DisplayName("Valid Input - Not a quadratic equation")
	@Test
	void test2() {
		assertEquals("Not a quadratic equation", qe.calculateroot(0, 3, 5));
	}
	
	@DisplayName("Valid Input - Roots are equal")
	@Test
	void test3() {
		assertEquals("Roots are equal", qe.calculateroot(1,2,1));
	}
	
	@DisplayName("Valid Input - Imaginary roots")
	@Test
	void test4() {
		assertEquals("Imaginary roots", qe.calculateroot(2,4,5));
	}
	
	@DisplayName("Valid Input - Real Roots")
	@Test
	void test5() {
		assertEquals("Real Roots", qe.calculateroot(1,5,6));
	}
	
	@DisplayName("Valid Input - Real Roots")
	@Test
	void test6() {
		assertEquals("Real Roots", qe.calculateroot(100,250,100));
	}
}
