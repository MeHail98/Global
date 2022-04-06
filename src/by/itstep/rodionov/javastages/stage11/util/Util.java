package by.itstep.rodionov.javastages.stage11.util;

import java.util.Scanner;

public class Util {

    static Scanner sc = new Scanner(System.in);

    public static void print (int a) {
        System.out.print(a);
    }
    public static void print (Object a) {
        System.out.print(a);
    }
    public static String read () {
        return sc.nextLine();
    }
}
