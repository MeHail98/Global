package by.itstep.rodionov.javastages.stage13.util;

import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner(System.in);

    public static void print (String msg) {
        System.out.print(msg);
    }

    public static String scan () {
        return sc.nextLine();
    }
}
