package examples.roman;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class RomanNumberConverterTest {

    @Test
    @DisplayName("MMD")
    public void convertToRomanNumber() {
        String expected = "MMD";
        String actual = RomanNumberConverter.convertToRomanNumber(2500);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("VII")
    public void convert7ToRomanNumber(){
        String expected = "VII";
        String actual = RomanNumberConverter.convertToRomanNumber(7);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition(){
        assertEquals(2,1.0 + 1.0, 0.001);
    }
}