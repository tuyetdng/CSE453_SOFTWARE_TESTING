package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem3 {
	Client_Product cp = new Client_Product();

	@ParameterizedTest
	@CsvSource({ "Female,Yes,34,W X and Y", "Female,Yes,40,X and Y", "Female,Yes,70,Only Y", "Female,No, 30,W and X",
			"Female,No,40,Only X", "Female,No,70,No Product", "Male,Yes,34,Only X", "Male,Yes,40,Only X", "Male,Yes,70,Only X",
			"Male,No,30,Only X", "Male,No,40,X and Z", "Male,No,70,Only X" })
	void test(String Gender, String City_Dwellers, int age, String expectedProduct) {
		cp.setInput(Gender, City_Dwellers, age);
		assertEquals(expectedProduct, cp.assignProduct());
	}

	@DisplayName("Test condition for the female middle-aged shoppers - make the output re-assigned")
	@Test
	void test2() {
		cp.setInput("Female", "Yes", 30);
		assertEquals("W X and Y", cp.assignProduct());
	}

}
