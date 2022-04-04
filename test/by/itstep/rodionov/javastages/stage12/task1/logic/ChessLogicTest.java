package by.itstep.rodionov.javastages.stage12.task1.logic;

import org.junit.Assert;
import org.junit.Test;


public class ChessLogicTest {
    @Test
    public void testCheckrookStep(){

        // для реальных точек без значений которые выходят за рамки, нужно еще пару тест кейсов написать
        int x1 = 4, y1 = 4;
        int[][] dot = {{1,4},{2,4},{3,4},{5,4},{6,4},{7,4},{8,4},{4,1},{4,2},{4,3},{4,5},{4,6},{4,7},{4,8}};
        for (int i = 0; i < dot.length; i++) {
            int x2 = dot[i][0];
            int y2 = dot[i][1];

            boolean actual = ChessLogic.chekRookStep(x1, y1, x2, y2);

            String error = "unable to get to cell"+ x2 + y2;

            Assert.assertTrue(error, actual);
        }
    }
}
