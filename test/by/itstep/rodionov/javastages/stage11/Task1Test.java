package by.itstep.rodionov.javastages.stage11;

import by.itstep.rodionov.javastages.stage11.logic.LogicForStage11;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    @Test
    public void testSumTask1 (){
        int number = 123456789;
        int expected = 45;
        int actual = LogicForStage11.findSumOfNumerals(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfNumeralsTask1(){
        int number = 123456789;
        int expected = 9;
        int actual = LogicForStage11.findNumberOfNumerals(number);
        Assert.assertEquals(expected, actual);
    }
}
