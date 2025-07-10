import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculationTest {

    AreaCalculation area;

    @BeforeEach
    void init(){
        area = new AreaCalculation();
    }

    @Test
    void testComputeSquareArea(){
        assertEquals(49,area.computeSquareArea(7));
    }

    @Test
    void testComputeCircleArea(){
        assertEquals(78.5, area.computeCircleArea(5));
    }

    @Test
    void throwExceptionInComputeSquareArea(){
        assertThrows(IllegalArgumentException.class, () -> area.computeSquareArea(-7));
    }

    @Test
    void throwExceptionInComputeCircleArea(){
        assertThrows(IllegalArgumentException.class, ()->area.computeCircleArea(-2.5));
    }

    @AfterEach
    void destroy(){
        System.out.println("After test clean up");
    }
}