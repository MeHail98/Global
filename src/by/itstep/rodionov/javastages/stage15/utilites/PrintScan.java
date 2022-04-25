package by.itstep.rodionov.javastages.stage15.utilites;

import java.util.Scanner;

public class PrintScan {
    public static Scanner sc = new Scanner(System.in);

    public static String readString () {
        return sc.nextLine();
    }

    public static void print (String msg){
        System.out.println(msg);
    }

    public static boolean isAppropriate(String num){
        boolean appropriate = true;
        int number;
        try {
            number = Integer.parseInt(num);
            if (number<1) return false;
        } catch (NumberFormatException e){
            appropriate = false;
        }
        return appropriate;
    }

    public static int securedInput (){
        String number = "";
        boolean appropriate = false;
        while (!appropriate) {
            number = readString();
            appropriate = isAppropriate(number);
            if (!appropriate) print("Not appropriate number, try again:");
        }
        return Integer.parseInt(number);
    }
}
