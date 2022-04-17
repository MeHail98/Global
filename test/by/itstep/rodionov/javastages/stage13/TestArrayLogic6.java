package by.itstep.rodionov.javastages.stage13;

import by.itstep.rodionov.javastages.stage13.arrayLogic.LogicTask6;
import org.junit.Assert;
import org.junit.Test;

public class TestArrayLogic6 {

    @Test
    public void testMakePercentageList(){
        double[] marks = {1,2,3,4,5,1,2,3,4,1};
        double[] percentageListExpected = {0, 30, 20,20,20,10};
        double[] percentageListActual = LogicTask6.makeMarksPercentageList(marks);
        Assert.assertArrayEquals(percentageListExpected,percentageListActual,0.01);

        marks = null;
        percentageListActual = LogicTask6.makeMarksPercentageList(marks);
        Assert.assertArrayEquals(null,percentageListActual, 0.01);
    }
}
