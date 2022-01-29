package pl.pasko.daysChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysCheckerTest {
    @Test
    void shouldPrintMondayIfNumberIs1(){
        //given
        int number = 1;
        //when
        String dayOfTheWeek = DaysChecker.printDayOfTheWeek(number);
        // then
        assertTrue( true, dayOfTheWeek);
    }
    @Test
    void shouldPrintThereIsNoSuchDayIfNumberIs8(){
        //given
        int number = 1;
        //when
        String dayOfTheWeek = DaysChecker.printDayOfTheWeek(number);
        // then
        assertFalse( false, dayOfTheWeek);
    }
    @Test
    void shouldPrintThereIsNoSuchDayIfNumberIsMinus1(){
        //given
        int number = -1;
        //when
        String dayOfTheWeek = DaysChecker.printDayOfTheWeek(number);
        // then
        assertFalse( false, dayOfTheWeek);
    }

}