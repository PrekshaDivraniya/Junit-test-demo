import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    //green
    @Test
    void emptyStringShouldAlwaysReturnZero(){
        var calculator = new StringCalculator();
        assertEquals(0,calculator.addNumbersFromString(""));
    }

    //red
    @Test
    void singleNumberShouldReturnThatNumberOnly(){
        var calculator = new StringCalculator();
        assertEquals(5,calculator.addNumbersFromString("5"));
    }

    @Test
    void twoCommaSeparatedNumbersInStringResultInSum(){
        var calculator = new StringCalculator();
        assertEquals(18,calculator.addNumbersFromString("10,8"));
    }

    @Test
    void fiveCommaSeparatedNumbersInStringResultInSum(){
        var calculator = new StringCalculator();
        assertEquals(25,calculator.addNumbersFromString("5,4,3,3,10"));
    }
}