package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.util.Util.*;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;

public class Task8 {
    public static void main(String[] args) {
        //проверяет является ли число числом армстронга
        int num = checkConsoleInput();
        print(isArmstrongNumber(num)? "Yes, armstrong number\n": "Not an Armstrong number\n");

        //находит все числа армстронга для заданого количества символов
        int num1 = checkConsoleInput();
        print("Armstrong numbers: " + findAllArmstrongNumbers(num1));
    }
}
