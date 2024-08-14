package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

class Test2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Test positive Number")
	@Test
	public void testConvertToDoubleOKPositive() {
		String age = "-1990";
		assertEquals(-1990, StringUtils.convertToDouble(age));

	}

	@DisplayName("Test negative Number")
	@Test
	public void testConvertToDoubleOKNegative() {
		String age = "1990";
		assertEquals(1990, StringUtils.convertToDouble(age));

	}

	@DisplayName("Test Not Null")
	@Test
	public void testConvertToDoubleWithNullArgument() {
		String age = null;
		Double actual = StringUtils.convertToDouble(age);
		assertNull(actual, "The actual is not null");
	}

	@DisplayName("Test Assert All")
	@Test
	public void testConvertToDoubleOK() {
		String age = "1990";
		Double expAge = Double.valueOf(age);
		Double actual = StringUtils.convertToDouble(age);
		assertAll("Do many assertions.", () -> {
			assertNotNull(actual);
			assertEquals(expAge, actual);
		});
	}

	@DisplayName("Test Assert Throws")
	@Test
	public void testConvertToDoubleThrowException() {
		String age = "N/A";
		assertThrows(NumberFormatException.class, () -> {
			StringUtils.convertToDouble(age);
		});
	}

	@DisplayName("Test Assert True")
	@ParameterizedTest
	@ValueSource(ints = { 1, 3, 5, 7, 9 })
	public void testCheckOddWithOddNumbers(int number) {
		assertTrue(Odd.checkOdd(number), "The number " + number + " is not odd");
	}

	@DisplayName("Test CSVFile")
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(String input, String expected) {
		String actualValue = input.toUpperCase();
		assertEquals(expected, actualValue);
	}

	static Stream<Arguments> provideStringsForIsBlank() {
		return Stream.of(Arguments.of(null, true), Arguments.of("", true), Arguments.of(" ", true),
				Arguments.of("not blank", false));
	}

	@ParameterizedTest
	@MethodSource("provideStringsForIsBlank")
	void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
		assertEquals(expected, StringUtils.isBlank(input));
	}

}
