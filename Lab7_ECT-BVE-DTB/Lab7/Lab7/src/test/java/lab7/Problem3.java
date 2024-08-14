package lab7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem3 {

	@ParameterizedTest
	@CsvSource({ "false, true, true, 10", "false, true, false, 10", "false, false, true, 10", "false, false, false, 15",
			"true, true, true, 30", "true, true, false, 30", "true, false, true, 30", "true, false, false, 32" })
	void testPhone_sub(boolean inter, boolean renew, boolean loyal, int expected) {
		PhoneSubscription P = new PhoneSubscription();
		P.setinternational(inter);
		P.setautoReneual(renew);
		P.setloyal(loyal);

		assertEquals(expected, P.priceperMonth());
	}

}
