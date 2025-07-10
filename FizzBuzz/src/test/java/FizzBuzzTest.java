import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void given0Expect0(){
        var checkFizzBuzz = new FizzBuzz();
        assertEquals(0,checkFizzBuzz.returnFizzBuzz(0));
    }

    @Test
    void given1Expect1(){
        var checkFizzBuzz = new FizzBuzz();
        assertEquals(1,checkFizzBuzz.returnFizzBuzz(1));
    }

    @Test
    void given3ExpectFizz(){
        var checkFizzBuzz = new FizzBuzz();
        assertEquals("Fizz",checkFizzBuzz.returnFizzBuzz(3));
    }

    @Test
    void given30ExpectFizz(){
        var checkFizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz",checkFizzBuzz.returnFizzBuzz(30));
    }

    @Test
    void given5ExpectBuzz(){
        var checkFizzBuzz = new FizzBuzz();
        assertEquals("Buzz",checkFizzBuzz.returnFizzBuzz(5));
    }

    @Test
    void given6ExpectFizz(){
        var checkFizzBuzz = new FizzBuzz();
        assertEquals("Fizz",checkFizzBuzz.returnFizzBuzz(6));
    }
}