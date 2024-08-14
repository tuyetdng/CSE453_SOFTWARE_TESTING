package lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Problem1 {

	@DisplayName("Valid value")
	@Test
	void test1() {
		ByteArrayOutputStream outActual = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outActual));
		BankAccount.withdraw(200);
		
		String outputExpected = "Valid";
		outputExpected += System.getProperty("line.separator");
		assertEquals(outputExpected, outActual.toString());
	}
	
	@DisplayName("Invalid value - Below the minimum value")
	@Test
	void test2() {
		ByteArrayOutputStream outActual = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outActual));
		BankAccount.withdraw(-1);
		
		String outputExpected = "Invalid";
		outputExpected += System.getProperty("line.separator");
		assertEquals(outputExpected, outActual.toString());
	}
	
	@DisplayName("Invalid value - Above the maximum value")
	@Test
	void test3() {
		ByteArrayOutputStream outActual = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outActual));
		BankAccount.withdraw(550);
		
		String outputExpected = "Invalid";
		outputExpected += System.getProperty("line.separator");
		assertEquals(outputExpected, outActual.toString());
	}
}
