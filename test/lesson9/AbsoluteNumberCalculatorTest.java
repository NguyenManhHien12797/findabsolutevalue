package lesson9;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("case 0")
    public void testFindAbsolute0(){
        int number=0;
        int expected= 0;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 1")
    public void testFindAbsolute1(){
        int number=1;
        int expected= 1;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case -1")
    public void testFindAbsoluteNegative1(){
        int number=-1;
        int expected= 1;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }



}