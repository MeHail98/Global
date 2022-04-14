package by.itstep.rodionov.javastages.stage12;

import by.itstep.rodionov.javastages.stage12.logic.ChessLogic;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class ChessLogicTest {


    @Test
    public void testInapropriateNumbers(){
        String [] x = {"9", "56", "-20", "kk","0","-1"};

        for (String element : x) {
            boolean appropriate = ChessLogic.isAppropriateCoordinate(element);
            Assert.assertFalse(appropriate);
        }
    }


    @Test
    public void testCheckRookStep(){

        // для реальных точек без значений которые выходят за рамки, нужно еще пару тест кейсов написать
        int x1 = 4, y1 = 4;
        int[][] dot = {{1,4},{2,4},{3,4},{5,4},{6,4},{7,4},{8,4},{4,1},{4,2},{4,3},{4,5},{4,6},{4,7},{4,8}};
        for (int[] ints : dot) {
            int x2 = ints[0];
            int y2 = ints[1];

            boolean actual = ChessLogic.checkRookStep(x1, y1, x2, y2);

            String error = "unable to get to cell" + x2 + y2;

            Assert.assertTrue(error, actual);
        }
    }

    @Test
    public void testKingStepPositive(){
        //значения в пределах одной клетки
        int x1 = 3, y1 =3;

        int[][] array = {{2, 2}, {2, 3}, {2, 4}, {3, 2}, {3, 4}, {4, 2}, {4, 3}, {4, 4}};

        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkKingStep(x1, y1, x2, y2);
            if (!actual) Assert.fail(Arrays.toString(ints));
        }
    }

    @Test
    public void testKingStepNegative(){
        //значения выходящие за рамки хода короля включая текущую клетку
        int x1 = 5, y1 =5;

        int[][] array = {{7, 5}, {7, 6}, {7, 7}, {1, 2}, {5, 5}, {8, 2}, {2, 7}, {2, 4}};

        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkKingStep(x1, y1, x2, y2);
            if (actual) Assert.fail(Arrays.toString(ints));
        }
    }


    @Test
    public void testElephantStepPositive(){
        int x1 = 4, y1 =3;

        int[][] array = {{3, 2}, {2, 1}, {5, 2}, {6, 1}, {3, 4}, {5, 4}, {6, 5}, {2, 5}};

        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkElephantStep(x1, y1, x2, y2);
            if (!actual) Assert.fail(Arrays.toString(ints));
        }
    }


    @Test
    public void testElephantStepNegative(){
        int x1 = 4, y1 =4;

        int[][] array = {{7, 5}, {7, 6}, {4, 4}, {5, 2}, {8, 2}, {2, 7}, {2, 4}, {8,1}};

        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkElephantStep(x1, y1, x2, y2);
            if (actual) Assert.fail(Arrays.toString(ints));
        }
    }


    @Test
    public void testQueenStepPositive(){
        int x1 = 4, y1 = 3;

        int[][] array = {{1,3}, {1,6},{2,1},{2,3},{2,5},{3,2},{3,4},{4,1},{4,8},{5,2},{5,3},{6,1},{6,3},{7,3},{7,6},{8,7}};
        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkQueenStep(x1, y1, x2, y2);
            if (!actual) Assert.fail(Arrays.toString(ints));
        }
    }


    @Test
    public void testQueenStepNegative(){
        int x1 = 4, y1 = 3;

        int[][] array = {{1,1}, {1,4},{2,2},{2,4},{2,6},{3,1},{3,8},{5,1},{5,5},{6,2},{6,4},{7,2},{7,8},{8,5}};
        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkQueenStep(x1, y1, x2, y2);
            if (actual) Assert.fail(Arrays.toString(ints));
        }
    }


    @Test
    public void testKnightStepPositive(){
        int x1 = 6, y1 = 6;

        int[][] array = {{5,4},{4,5},{4,7},{5,8},{7,4},{7,8},{8,5},{8,7}};
        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkKnightStep(x1, y1, x2, y2);
            if (!actual) Assert.fail(Arrays.toString(ints));
        }
    }


    @Test
    public void testKnightStepNegative(){
        int x1 = 6, y1 = 6;

        int[][] array = {{1,3}, {1,6},{2,1},{2,3},{2,5},{3,2},{3,4},{6,6},{4,8},{5,2},{5,3},{6,1}};
        for (int[] ints : array) {
            int x2 = ints[0];
            int y2 = ints[1];
            boolean actual = ChessLogic.checkKnightStep(x1, y1, x2, y2);
            if (actual) Assert.fail(Arrays.toString(ints));
        }
    }
}
