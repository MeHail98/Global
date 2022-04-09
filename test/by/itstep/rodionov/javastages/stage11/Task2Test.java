package by.itstep.rodionov.javastages.stage11;

import by.itstep.rodionov.javastages.stage11.logic.LogicForStage11;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void testNumberOfDifferentNum(){
        int num = 123456789;
        int expected = 9;
        int actual = LogicForStage11.findNumberOfDifferentNumerals(num);
        Assert.assertEquals(expected, actual);
    }
}
