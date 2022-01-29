package pl.pasko.adultChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdultCheckerTest {
    @Test
    public void shouldReturnTrueIfAgeIs18(){
        //given
        int age = 18;
        //when
        boolean result = AdultChecker.isAdult(age);
        //then
        assertTrue(result);
    }
    @Test
    public void shouldReturnFalseIfAgeIs17(){
        //given
        int age = 17;
        //when
        boolean result = AdultChecker.isAdult(age);
        //then
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseIfAgeIs0(){
        //given
        int age = 0 ;
        //when
        boolean result = AdultChecker.isAdult(age);
        //then
        assertFalse(result);
    }
}