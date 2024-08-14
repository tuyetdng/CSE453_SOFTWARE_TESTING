package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class Problem3 {

	@DisplayName("Test Triangle")
	@Test
	void test() {
		double a = 1;
		double b = 2;
		double c = 1;
		assertFalse(Triangle.isTriangle(a, b, c),"Test case with 3 sides: 1, 1, 2 is not a triangle");

	}
	@DisplayName("Test negative")
	@Test
	void testNegativeNum() {
		double a = 2;
		double b = 2;
		double c = -1;
		assertFalse(Triangle.isTriangle(a, b, c),"Negative number cannot form a triangle");

	}
}
