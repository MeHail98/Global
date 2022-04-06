package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.findNumberOfDifferentNumerals;
import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.isNumber;
import static by.itstep.rodionov.javastages.stage11.util.Util.print;
import static by.itstep.rodionov.javastages.stage11.util.Util.read;

public class Task2 {
    public static void main(String[] args) {
        //Разработайте программу, которая эффективным образом определяет количество различных цифр заданного натурального числа.

        boolean boolNumber = false;
        String number = "";
        while (!boolNumber) {
            print("Type a number: ");
            number = read();
            boolNumber = isNumber(number);
            if (!boolNumber) print("Please try again\n");
        }
        int num = Integer.parseInt(number);
        print("Number of different numerals is: " + findNumberOfDifferentNumerals(num));
    }
}
