package by.itstep.rodionov.javastages.stage13;

import by.itstep.rodionov.javastages.stage13.arrayLogic.LogicTask3;
import org.junit.Assert;
import org.junit.Test;

public class TestArrayLogic3 {

    @Test
    public void testIsMirrored() {
        double[] arrayMirroredUnavailableMiddle = {1,2,3,5,5,3,2,1};
        double[] arrayMirroredAvailableMiddle = {3,4,5,4,3,};
        double[] arrayNotMirrored = {1,2,3,5,1,8,9};
        Assert.assertTrue(LogicTask3.isMirrored(arrayMirroredAvailableMiddle));
        Assert.assertTrue(LogicTask3.isMirrored(arrayMirroredUnavailableMiddle));
        Assert.assertFalse(LogicTask3.isMirrored(arrayNotMirrored));
    }
}