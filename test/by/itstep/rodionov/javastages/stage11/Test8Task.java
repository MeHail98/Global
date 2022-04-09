package by.itstep.rodionov.javastages.stage11;

import by.itstep.rodionov.javastages.stage11.logic.LogicForStage11;
import org.junit.Assert;
import org.junit.Test;

public class Test8Task {

    @Test
    public void testIsArmstrongNumberFalse(){
        int[] num = {25, 113, 1123, 11568};
        boolean isArmstrong = false;

        boolean actual;
        for (int i: num) {
            actual = LogicForStage11.isArmstrongNumber(i);
            Assert.assertEquals(isArmstrong, actual);
        }
    }

    @Test
    public void testIsArmstrongNumberTrue(){
        int[] num = {153, 370, 371, 407, 8208, 9474, 54748, 92727};
        boolean isArmstrong = true;

        boolean actual;
        for (int i: num) {
            actual = LogicForStage11.isArmstrongNumber(i);
            String msg = "Не совпало на элементе " + i;

            Assert.assertEquals(msg, isArmstrong, actual);
        }
    }

}
