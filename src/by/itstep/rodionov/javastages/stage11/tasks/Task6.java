package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;
import static by.itstep.rodionov.javastages.stage11.util.Util.*;

public class Task6 {
    public static void main(String[] args) {
        //программа вычисляет факториал заданного натурального числа

        int number = checkConsoleInput();
        String msg = findFactorial(number) == -1? "Too big numeral": "Factorial = "+ findFactorial(number);
        print(msg);
    }
}
