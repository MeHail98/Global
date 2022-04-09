package by.itstep.rodionov.javastages.stage11;

import by.itstep.rodionov.javastages.stage11.logic.LogicForStage11;
import org.junit.Assert;
import org.junit.Test;

public class Task5Test {
    @Test
    public void testIsSimple(){
        int num = 123456789;
        boolean expected = false;
        boolean actual = LogicForStage11.checkIsSimple(num);
        Assert.assertEquals(expected, actual);

        int num1 = 13;
        boolean expected1 = true;
        boolean actual1 = LogicForStage11.checkIsSimple(num1);
        Assert.assertEquals(expected1, actual1);
    }
}
