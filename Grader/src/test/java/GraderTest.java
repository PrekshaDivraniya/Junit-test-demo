import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyEightSHouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(58));
    }

    @Test
    void sixtyOneShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(61));
    }

    @Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }

    @Test
    void seventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(79));
    }

    @Test
    void eightFiveShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(85));
    }

    @Test
    void zeroShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(0));
    }

    @Test
    void seventyShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(70));
    }
    @Test
    void eightyShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(80));
    }
    @Test
    void ninetyShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(90));
    }
    @Test
    void sixtyShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(60));
    }

    @Test
    void nagativeShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, ()->{
            grader.determineLetterGrade(-1);
        });
    }
}