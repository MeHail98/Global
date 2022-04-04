package by.itstep.rodionov.javastages.stage12.task1.logic;

public class ChessLogic {
    public static boolean chekRookStep(int x1,int y1,int x2, int y2) {
        // как ходит ладья
        return (x1 == x2 && y1 != y2) || (y1 == y2 && x1 != x2);

    }
}
