package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;

import static by.itstep.rodionov.javastages.stage11.util.Util.*;

public class Task1 {
    public static void main(String[] args) {
//  Разработайте программу, которая подсчитывает сумму цифр числа и их количество

        boolean boolNumber = false;
        String number = "";
        while (!boolNumber) {
            print("Type a number: ");
            number = read();
            boolNumber = isNumber(number);
            if (!boolNumber) print("Please try again\n");
        }
        int num = Integer.parseInt(number);
        print("Number of numerals: " + findNumberOfNumerals(num)
                + "\nSum of numerals: " + findSumOfNumerals(num));
    }
}
