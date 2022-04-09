package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.util.Util.*;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;

public class Task9 {
    public static void main(String[] args) {
        //Разработайте программу, которая эффективным образом высчитывает НОД и НОК двух заданных чисел

        int number1 = checkConsoleInput();
        int number2 = checkConsoleInput();

        String NOD = findNOD(number1,number2) + "";
        String NOK = findNOK(number1, number2) == 0? "\nUnable to find NOK, too big numerals" : "\nNOK is " + findNOK(number1, number2);

        print("NOD is " + NOD + NOK);
    }
}
