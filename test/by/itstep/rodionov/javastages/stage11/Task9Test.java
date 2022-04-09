package by.itstep.rodionov.javastages.stage11;

import by.itstep.rodionov.javastages.stage11.logic.LogicForStage11;
import org.junit.Assert;
import org.junit.Test;

public class Task9Test {

    @Test
    public void testFindNodNormal(){
        int actual = LogicForStage11.findNOD(25,15);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindNodMinimal(){
        int actual = LogicForStage11.findNOD(-10,-10);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindNodBig(){
        int actual = LogicForStage11.findNOD(123456789,987654321);
        int expected = 9;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindNokNormal(){
        int actual = LogicForStage11.findNOK(25,15);
        int expected = 75;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindNokBig(){
        int actual = LogicForStage11.findNOK(12356784,1234677);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}
