package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem2 {
	CommissioningProblem cp = new CommissioningProblem();

	@DisplayName("Test Locks")
	@ParameterizedTest
	@CsvSource({ "1,50,50,490", "2,50,50,428", "50,50,50,860", "69,50,50,1031", "70,50,50,1040" })
	void test1(int locks,int stocks,int barrales, double Commission) {
		cp.setInput(locks, stocks, barrales);
		double sale = cp.calSale();
		assertEquals(Commission, cp.calCommission(sale), 0.01);
	}
	
	@DisplayName("Test stocks")
	@ParameterizedTest
	@CsvSource({ "50,1,50,566", "50,2,50,572", "50,79,50,834", "50,80,50,840" })
	void test2(int locks,int stocks,int barrales, double Commission) {
		cp.setInput(locks, stocks, barrales);
		double sale = cp.calSale();
		assertEquals(Commission, cp.calCommission(sale), 0.01);
	}

	@DisplayName("Test barrales")
	@ParameterizedTest
	@CsvSource({ "50,50,1,615", "50,50,2,620", "50,50,89,855", "50,50,90,1060" })
	void test3(int locks,int stocks,int barrales, double Commission) {
		cp.setInput(locks, stocks, barrales);
		double sale = cp.calSale();
		assertEquals(Commission, cp.calCommission(sale), 0.01);
	}
	
	@DisplayName("Test barrales condition")
	@Test
	void test4() {
		cp.setInput(1,1,1);
		double sale = cp.calSale();
		assertEquals(10, cp.calCommission(sale), 0.01);
	}
}
