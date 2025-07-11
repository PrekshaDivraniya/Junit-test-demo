import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calculator;
    @BeforeEach
    void init(){
        calculator = new StringCalculator();
    }

    //green
    @Test
    void emptyStringShouldAlwaysReturnZero(){

        assertEquals(0,calculator.addNumbersFromString(""));
    }

    //red
    @Test
    void singleNumberShouldReturnThatNumberOnly(){
        assertEquals(5,calculator.addNumbersFromString("5"));
    }

    @Test
    void twoCommaSeparatedNumbersInStringResultInSum(){
        assertEquals(18,calculator.addNumbersFromString("10,8"));
    }

    @Test
    void fiveCommaSeparatedNumbersInStringResultInSum(){
        assertEquals(25,calculator.addNumbersFromString("5,4,3,3,10"));
    }

    @Test
    void newLineShouldBeTreatedAsDelimiter(){
        assertEquals(7,calculator.addNumbersFromString("1,2\n2,2"));
    }

    @Test
    void customDelimiterCheck(){
        assertEquals(8,calculator.addNumbersFromString("1,1;2\n3,1"));
    }

    @Test
    void negativeNumberShouldThrowException(){
        assertThrows(IllegalArgumentException.class, ()->calculator.addNumbersFromString("-1,2;9\n-4"));
    }

    @Test
    void numbersGreaterThan1000AreIgnored(){
        assertEquals(4,calculator.addNumbersFromString("1000,2,1,1,2983"));
    }

    @Test
    void newLineAtTheEnd(){
        assertEquals(3,calculator.addNumbersFromString("1;2\n"));
    }
}