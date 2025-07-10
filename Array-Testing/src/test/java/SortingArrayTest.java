import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingArrayTest {

    @Test
    void givenSingleElementArrayShouldReturnExactSame(){
        var arr = new SortingArray();
        Object[] expected = {5};
        Object[] actual = {5};
        arr.sortingArray(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenElementsOfArrayShouldReturnSorted(){
        var arr = new SortingArray();
        Object[] expected = {5,6,7,8};
        Object[] actual = {6,8,5,7};
        arr.sortingArray(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenEmptyArrayShouldReturnException(){
        var arr = new SortingArray();
        Object[] actual = {};
        assertThrows(NullPointerException.class, ()-> arr.sortingArray(actual));
    }

    @Test
    void givenCharsInArrayShouldReturnException(){
        var arr = new SortingArray();
        Object[] actual = {'a',2,3};
        assertThrows(ClassCastException.class, ()-> arr.sortingArray(actual));
    }
}