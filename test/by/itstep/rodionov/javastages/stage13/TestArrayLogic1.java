package by.itstep.rodionov.javastages.stage13;

import by.itstep.rodionov.javastages.stage13.arrayLogic.LogicTask1;
import org.junit.Assert;
import org.junit.Test;

public class TestArrayLogic1 {

    @Test
    public void testFindMin(){
        double[] array = {1,5,6,6,7,-7,5,4,-2};
        double actualMin = LogicTask1.findMin(array);
        Assert.assertEquals(-7,actualMin,0.01);
    }

    @Test
    public void testSwapMinMax(){
        double[] array = {1,5,6,6,7,-7,5,4,-2,90};
        Assert.assertArrayEquals(LogicTask1.swapMinMax(array), new double[]{1, 5, 6, 6, 7, 90, 5, 4, -2, -7}, 0.1);
    }

    @Test
    public void testFindSum(){
        double[] array = {1,2,3,4,90,100,110};
        Assert.assertEquals(10, LogicTask1.findSum(array), 0.000001);
    }

    @Test
    public void testFindMultiplication(){
        double[] array = {1.1,2.5,3.7,-4.9,-8.6,5.5};
        Assert.assertEquals(13.75, LogicTask1.findMultiplication(array), 0.000001);
    }
}
