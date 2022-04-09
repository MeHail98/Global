package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;
import static by.itstep.rodionov.javastages.stage11.util.Util.*;

public class Task1 {
    public static void main(String[] args) {
//  Разработайте программу, которая подсчитывает сумму цифр числа и их количество

        int num = checkConsoleInput();
        print("Number of numerals: " + findNumberOfNumerals(num)
                + "\nSum of numerals: " + findSumOfNumerals(num));
    }
}
