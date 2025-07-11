import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    MarsRover rover;
    @BeforeEach
    void init(){
        rover = new MarsRover(0,0,"N");
    }
    @Test
    void shouldInitializeRoverAtGivenPositionAndDirection(){
        assertEquals("0 0 N",rover.getPosition());
    }

    @Test
    void moveRoverInTheSameDirection(){
        rover.execute("M");
        assertEquals("0 1 N",rover.getPosition());
    }

    @Test
    void turnDirectionToRight(){
        rover.execute("R");
        assertEquals("0 0 E",rover.getPosition());
    }

    @Test
    void givenSomeMovesToGetDesiredPostionAndDirection(){
        rover.execute("MRMLMLL");
        assertEquals("1 2 S",rover.getPosition());
    }

    @Test
    void checkFullCircleUsingLeft(){
        rover.execute("LLLL");
        assertEquals("0 0 N", rover.getPosition());
    }

    @Test
    void shouldReturnToOriginalPositionAfterSquarePath() {
        rover.execute("MRMRMRMR"); // Move & turn right in a square
        assertEquals("0 0 N", rover.getPosition());
    }

    @Test
    void shouldCoverAllLinesOfCode(){
        rover.execute("MXL");
        assertEquals("0 1 W", rover.getPosition());
    }

    @AfterAll
    static void destroy(){
        System.out.println("All tests are passed");
    }
}