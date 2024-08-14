package lab2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Problem1 {

//	@DisplayName("Test specific number")
//	@Test
//	public void testWithSpecificNumber() {
//		String input = "4";
//		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//
//		ByteArrayOutputStream outActual = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outActual));
//
//		String[] args = {};
//		CircleRadius.main(args);
//
//		String outputExpected = "Enter the radius ";
//		outputExpected += System.getProperty("line.separator");
//		outputExpected += String.valueOf(2 * Math.PI * 4);
//		outputExpected += System.getProperty("line.separator");
//
//		assertEquals(outputExpected, outActual.toString());
//	}

//	@DisplayName("Test negative number")
//	@Test
//	public void testNegativeNumber() {
//		String input = "-1";
//		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//
//		ByteArrayOutputStream outActual = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outActual));
//
//		String[] args = {};
//		CircleRadius.main(args);
//
//		String outputExpected = "Enter the radius ";
//		outputExpected += System.getProperty("line.separator");
//		outputExpected += "-1";
//		outputExpected += System.getProperty("line.separator");
//
//		assertEquals(outputExpected, outActual.toString());
//	}
//
//	@DisplayName("Test 10^9")
//	@Test
//	public void testMaxIntNumber() {
//		String input = "1000000000";
//		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//		System.setIn(in);
//
//		ByteArrayOutputStream outActual = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(outActual));
//
//		String[] args = {};
//		CircleRadius.main(args);
//
//		String outputExpected = "Enter the radius ";
//		outputExpected += System.getProperty("line.separator");
//		outputExpected += "-1";
//		outputExpected += System.getProperty("line.separator");
//
//		assertEquals(outputExpected, outActual.toString());
//	}
//
	@DisplayName("Test letter")
	@Test
	public void testLetter() {
		String input = "f";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		ByteArrayOutputStream outActual = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outActual));

		String[] args = {};
		CircleRadius.main(args);

		String outputExpected = "Enter the radius ";
		outputExpected += System.getProperty("line.separator");
		outputExpected += "-1";
		outputExpected += System.getProperty("line.separator");

		assertEquals(outputExpected, outActual.toString());
	}
}
