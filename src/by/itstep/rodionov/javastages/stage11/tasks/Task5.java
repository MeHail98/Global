package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;
import static by.itstep.rodionov.javastages.stage11.util.Util.*;

public class Task5 {
    public static void main(String[] args) {
        //Программа проверяет является ли заданное натуральное число простым

        int number = checkConsoleInput();
        String msg = checkIsSimple(number)? "simple": "not simple";
        print("This number is " + msg);
    }
}
