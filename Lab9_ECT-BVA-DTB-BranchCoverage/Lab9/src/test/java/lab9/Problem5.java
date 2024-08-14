package lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Problem5 {
	CaesarShiftCipher csc = new CaesarShiftCipher();

    @Test
    @DisplayName("Test normal shift within range")
    void testNormalShift() {
        String result = csc.CaesarShift("ABB", 4);
        assertEquals("EFF", result);
    }
    
    @Test
    @DisplayName("Test shift that back star the alphabet")
    void testBackStarShift() {
        String result = csc.CaesarShift("XYZ", 3);
        assertEquals("ABC", result);
    }
    
    @Test
    @DisplayName("Test shift with negative value")
    public void testNegativeShift() {
        String result = csc.CaesarShift("ABC", -3);
        assertEquals("XYZ", result);
    }
    @Test
    @DisplayName("Test not in alphabet")
    void testNotALetter() {
        String result = csc.CaesarShift("123", 3);
        assertEquals("invalid", result);
    }
    
    @Test
    @DisplayName("Test wrap shift back start with letters near the end of the alphabet")
    public void testWrapAroundEndOfAlphabet() {
        String result = csc.CaesarShift("XYZ", 3);
        assertEquals("ABC", result);
    }
}
