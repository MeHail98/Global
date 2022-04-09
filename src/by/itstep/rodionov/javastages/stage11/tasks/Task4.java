package by.itstep.rodionov.javastages.stage11.tasks;

import by.itstep.rodionov.javastages.stage11.util.Util;
import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;

public class Task4 {
    public static void main(String[] args) {
        //программа вычисляет обратное число от введенного пользователем

        int number = checkConsoleInput();
        Util.print("Inverted number is: " + invertNumber(number));
    }
}
