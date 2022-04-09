package by.itstep.rodionov.javastages.stage11;

import by.itstep.rodionov.javastages.stage11.logic.LogicForStage11;
import org.junit.Assert;
import org.junit.Test;

public class Task6Test {
    @Test
    public void testFactorial(){
    int num = 5;
    int factorial = 120;
    int actual = LogicForStage11.findFactorial(num);
        Assert.assertEquals(factorial, actual);
    }

    @Test
    public void testBigFactorial(){
        int num = 13;
        int factorial = -1;
        int actual = LogicForStage11.findFactorial(num);
        Assert.assertEquals(factorial, actual);
    }

}
