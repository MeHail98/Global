package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;
import static by.itstep.rodionov.javastages.stage11.util.Util.*;

public class Task2 {
    public static void main(String[] args) {
        //Разработайте программу, которая эффективным образом определяет количество различных цифр заданного натурального числа.

        int number =checkConsoleInput();
        print("Number of different numerals is: " + findNumberOfDifferentNumerals(number));
    }
}
