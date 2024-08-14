package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem4 {
	NextDate nd = new NextDate();

	@ParameterizedTest
	@CsvSource({ "2001,15,4,Next Date is :16-4-2001", "2001,30,4,Next Date is :1-5-2001",
			"2001,15,1,Next Date is :16-1-2001", "2001,31,1,Next Date is :1-2-2001",
			"2001,15,12,Next Date is :16-12-2001", "2001,31,12,Next Date is :1-1-2002",
			"2001,15,2,Next Date is :16-2-2001", "2004,28,2,Next Date is :29-2-2004",
			"2001,28,2,Next Date is :1-3-2001", "2004,29,2,Next Date is :1-3-2004",
			"2001,29,2,invalid date input for not a leap year", "2001,30,2,invalid date input for not a leap year" })
	void test1(int year, int date, int month, String expected) {
		nd.setYearmonthdate(year, date, month);
		assertEquals(expected, nd.next_date());
	}
	
	@Test
	void test1_2() {
		nd.setYearmonthdate(2001, 31, 4);
		assertEquals("value of day, not in the range day<=30", nd.next_date());
	}
	@Test
	void test2() {
		nd.setYearmonthdate(2000, 0, 1);
		assertEquals("Value of day, not in the range 1...31", nd.next_date());
	}

	@Test
	void test3() {
		nd.setYearmonthdate(2000, 1, 13);
		assertEquals("value of month, not in the range 1....12", nd.next_date());
	}

	@Test
	void test4() {
		nd.setYearmonthdate(2027, 1, 1);
		assertEquals("value of year, not in the range 1800.......2025", nd.next_date());
	}

	@Test
	void test5() {
		nd.setYearmonthdate(2000, 30, 2);
		assertEquals("invalid date input for leap year", nd.next_date());
	}

	@Test
	void test6() {
		nd.setYearmonthdate(2001, 32, 12);
		assertEquals("Value of day, not in the range 1...31", nd.next_date());
	}

	@Test
	void test7() {
		nd.setYearmonthdate(2025, 32, 12);
		assertEquals("the next day is out of boundary value of year", nd.next_date());
	}
	
	@DisplayName("Test condition for the next date in the end of december")
	@Test
	void test8() {
		nd.setYearmonthdate(2000, 31, 12);
		assertEquals("Next Date is :1-1-2001", nd.next_date());
	}

}
