package by.itstep.rodionov.javastages.stage11.tasks;

import java.util.Arrays;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;
import static by.itstep.rodionov.javastages.stage11.util.Util.*;

public class Task7 {
    public static void main(String[] args) {
        // Программа находит все простые делители числа

        int number = checkConsoleInput();
        print(findAllSimpleDividers(number));
    }
}
