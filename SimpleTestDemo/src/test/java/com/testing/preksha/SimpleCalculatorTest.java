package com.testing.preksha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void onePlusOneShouldEqualTwo(){
        var calculator = new SimpleCalculator();
        assertEquals(2,calculator.add(1,1));
    }
    @Test
    void threePlusSevenShouldEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));
    }
}