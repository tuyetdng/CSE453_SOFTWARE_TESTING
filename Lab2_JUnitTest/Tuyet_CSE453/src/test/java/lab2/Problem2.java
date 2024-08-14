package lab2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Problem2 {

	@DisplayName("Test more than three of the same Roman symbols together")
	@Test
	public void testMoreThanThreeSameNum() {
		RomantoInteger romantoInteger = new RomantoInteger();
		assertEquals(3, romantoInteger.convert("III"));
		assertEquals(-1, romantoInteger.convert("IIII"));
		assertEquals(3999, romantoInteger.convert("MMMCMXCIX"));
	}

	@DisplayName("If a symbol comes after a symbol that is larger or equal in value, then it must be added to the symbols before it.")
	@Test
	public void testAdded() {
		RomantoInteger romantoInteger = new RomantoInteger();
		assertEquals(6, romantoInteger.convert("VI"));
		assertEquals(8, romantoInteger.convert("VIII"));
		assertEquals(211, romantoInteger.convert("CCXI"));
	}

	@DisplayName("Smaller symbols placed before a larger numeral indicates subtraction of that smaller numeral from the larger one")
	@Test
	public void testSubtract() {
		RomantoInteger romantoInteger = new RomantoInteger();
		assertTrue(romantoInteger.convert("IV") == 4, "Conversion of 'IV' failed");
		assertTrue(romantoInteger.convert("IX") == 9, "Conversion of 'IX' failed");
		assertTrue(romantoInteger.convert("XIX") == 19, "Conversion of 'XIX' failed");

	}
	
	@DisplayName("A number can’t be created by subtracting more than one value from a Roman numeral.")
	@Test
	public void testMultiSubtraction() {
		RomantoInteger romantoInteger = new RomantoInteger();
		assertEquals(-1, romantoInteger.convert("IIV"));
		assertEquals(-1, romantoInteger.convert("IIIIX"));
		assertEquals(-1, romantoInteger.convert("IIIIIV"));
	}
}
