package by.itstep.rodionov.javastages.stage11;

import by.itstep.rodionov.javastages.stage11.logic.LogicForStage11;
import org.junit.Assert;
import org.junit.Test;

public class Task4Test {
    @Test
    public void testInversedNumber(){
        int num = 123456789;
        int expected = 987654321;
        int actual = LogicForStage11.invertNumber(num);
        Assert.assertEquals(expected, actual);
    }
}
