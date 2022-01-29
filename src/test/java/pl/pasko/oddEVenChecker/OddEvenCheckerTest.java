package pl.pasko.oddEVenChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenCheckerTest {
    @Test
    void shouldReturnTrueIfNumberIs2() {
        //given
        int number = 2;
        // when
        boolean result = OddEvenChecker.isEven(number);
        //then
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseIfNumberIs1() {
        //given
        int number = 1;
        // when
        boolean result = OddEvenChecker.isEven(number);
        //then
        assertFalse(result);
    }
    @Test
    void shouldReturnFalseIfNumberIsMinus3() {
        //given
        int number = -3;
        // when
        boolean result = OddEvenChecker.isEven(number);
        //then
        assertFalse(result);
    }

}