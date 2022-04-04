package by.itstep.rodionov.javastages.stage12.task1.controller;

import by.itstep.rodionov.javastages.stage12.task1.view.Printer;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer.print("Input 4 numbers:");
//         int x1 = sc.nextInt();
//         int x2 = sc.nextInt();
//         int y1 = sc.nextInt();
//         int y2 = sc.nextInt();

        boolean result = true;

        String msg = result? "Yes": "No";

        Printer.print(msg);

    }
}
