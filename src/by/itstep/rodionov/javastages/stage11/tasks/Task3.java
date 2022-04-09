package by.itstep.rodionov.javastages.stage11.tasks;

import static by.itstep.rodionov.javastages.stage11.logic.LogicForStage11.*;
import static by.itstep.rodionov.javastages.stage11.util.Util.*;

public class Task3 {
    public static void main(String[] args) {
        //Написать программу «Heads or Tails?» («Орёл или решка?»), которая бросает монету и сообщает, сколько раз вы-
        //пал орёл, а сколько – решка

        int number = checkConsoleInput();

        int headsFall = findHeadsFall(number);
        print("Heads fell " + headsFall + " times" +
                "\nTails fell " + (number - headsFall) + " times");
    }
}
