package by.itstep.rodionov.javastages.stage12.logic;

import java.util.Scanner;

import static by.itstep.rodionov.javastages.stage11.util.Util.print;

public class ChessLogic {

    static Scanner sc = new Scanner(System.in);

    public static boolean isAppropriateCoordinate(String x) throws NumberFormatException {
        try{
            int a = Integer.parseInt(x);
            return a<=8 && a>=1;
        } catch (NumberFormatException e){
            return false;
        }
    }

    private static int checkConsoleInput() {
        boolean boolNumber = false;
        String number = "";
        while (!boolNumber) {
            number = sc.nextLine();
            boolNumber = isAppropriateCoordinate(number);
            if (!boolNumber) System.out.println("Not appropriate number, please try again\n");
        }
        return Integer.parseInt(number);
    }

    private static int[] typeFourNumbers(){
        int[] array = new int[4];
        System.out.println("Type x1 coordinate:");
        array[0] = ChessLogic.checkConsoleInput();
        System.out.println("Type y1 coordinate:");
        array[1] = ChessLogic.checkConsoleInput();
        System.out.println("Type x2 coordinate:");
        array[2] = ChessLogic.checkConsoleInput();
        System.out.println("Type y2 coordinate:");
        array[3] = ChessLogic.checkConsoleInput();
        return array;
    }

    public static void RookTask() {
        int[] ar = typeFourNumbers();
        boolean result = ChessLogic.checkRookStep(ar[0], ar[1], ar[2], ar[3]);
        System.out.println(result ? "Yes, it is possible to move rook that way"
                : "No, it is impossible to move rook that way");
    }

    public static boolean checkRookStep(int x1,int y1,int x2, int y2) {
        return (x1 == x2 && y1 != y2) || (y1 == y2 && x1 != x2);
    }

    public static void KingTask() {
        int[] ar = typeFourNumbers();
        boolean result = ChessLogic.checkKingStep(ar[0], ar[1], ar[2], ar[3]);
        System.out.println(result ? "Yes, it is possible to move king that way"
                : "No, it is impossible to move king that way");
    }

    public static boolean checkKingStep (int x1, int y1, int x2, int y2){
        return ((x2 == x1-1 || x2 == x1+1) && (y2 == y1 || y2 == y1-1 || y2 == y1+1))
                || ((x2 == x1-1 || x2 == x1+1 || x2 == x1) && (y2 == y1-1 || y2 == y1+1));
    }

    public static void ElephantTask() {
        int[] ar = typeFourNumbers();
        boolean result = ChessLogic.checkElephantStep(ar[0], ar[1], ar[2], ar[3]);
        System.out.println(result ? "Yes, it is possible to move elephant that way"
                : "No, it is impossible to move elephant that way");
    }

    public static boolean checkElephantStep (int x1, int y1, int x2, int y2){
        return ((x2 - x1) == (y2-y1) || (x2 - x1) == (y1 - y2)) && (x1 != x2 && y1 !=y2);
    }

    public static void KnightTask(){
        int[] ar = typeFourNumbers();
        boolean result = ChessLogic.checkKnightStep(ar[0], ar[1], ar[2], ar[3]);
        System.out.println(result? "Yes, it is possible to move Knight that way"
                : "No, it is impossible to move Knight that way");
    }

    public static boolean checkKnightStep(int x1, int y1, int x2, int y2){
        return (Math.abs(x2 - x1) == 2 && Math.abs(y2-y1) == 1)
                || (Math.abs(x2 - x1) == 1 && Math.abs(y2-y1) == 2);
    }

    public static void QueenTask(){
        int[] ar = typeFourNumbers();
        boolean result = ChessLogic.checkQueenStep(ar[0], ar[1], ar[2], ar[3]);
        System.out.println(result? "Yes, it is possible to move Queen that way"
                : "No, it is impossible to move Queen that way");
    }

    public static boolean checkQueenStep (int x1, int y1, int x2, int y2){
        boolean rook = checkRookStep(x1, y1, x2, y2);
        boolean elephant = checkElephantStep(x1, y1, x2, y2);
        boolean king = checkKingStep(x1, y1, x2, y2);
        return rook || elephant || king;
    }
}
