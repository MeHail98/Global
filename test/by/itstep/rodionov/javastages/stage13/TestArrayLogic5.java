package by.itstep.rodionov.javastages.stage13;

import by.itstep.rodionov.javastages.stage13.arrayLogic.LogicTask5;
import org.junit.Assert;
import org.junit.Test;

public class TestArrayLogic5 {

    @Test
    public void testOddAndEven(){
        double[] evenOdd = {1,2,3,4,5,6,7,8,9};
        int numberOfEven = LogicTask5.findNumberOfEven(evenOdd);
        int numberOfOdd = LogicTask5.findNumberOfOdd(evenOdd);
        Assert.assertEquals(4,numberOfEven);
        Assert.assertEquals(5, numberOfOdd);
    }
}
