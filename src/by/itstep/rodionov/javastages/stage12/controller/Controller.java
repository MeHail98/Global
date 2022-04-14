package by.itstep.rodionov.javastages.stage12.controller;

import by.itstep.rodionov.javastages.stage12.logic.ChessLogic;

public class Controller {
    public static void main(String[] args) {
        //Может ли ладья за один ход попасть из точки а в точку б
        ChessLogic.RookTask();

        //Может ли король за один ход попасть из точки а в точку б
        ChessLogic.KingTask();

        //Может ли слон за один ход попасть из точки а в точку б
        ChessLogic.ElephantTask();

        //Может ли конь за один ход попасть из точки а в точку б
        ChessLogic.KnightTask();

        // Может ли ферзь за один ход попасть из точки а в точку б
        ChessLogic.QueenTask();
    }
}
