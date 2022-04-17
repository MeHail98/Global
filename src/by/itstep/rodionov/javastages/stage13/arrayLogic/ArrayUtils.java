package by.itstep.rodionov.javastages.stage13.arrayLogic;

import static by.itstep.rodionov.javastages.stage13.util.Utils.*;

public class ArrayUtils {

    private static boolean checkIsNumber(String number) {
        try {
            double isNumber = Double.parseDouble(number);
        } catch (NumberFormatException i) {
            return false;
        }
        return true;
    }

    private static double scanConsole() {
        boolean isNumber = false;
        String number = "";
        while (!isNumber) {
            number = scan();
            isNumber = checkIsNumber(number);
            if (!isNumber) print("Not a number, please type a number again:");
        }
        return Double.parseDouble(number);
    }

    private static boolean isInteger(double number) {
        return number == Math.floor(number);
    }

    public static double[] createArrayManual() {
        boolean isNumberInteger = false;
        double size = 0;
        print("Type array size(non-zero integer):");
        while (!isNumberInteger || size <= 0) {
            size = scanConsole();
            isNumberInteger = isInteger(size);
            if (!isNumberInteger || size <= 0) print("Please type positive integer to set array size:");
        }
        double[] array = new double[(int) size];
        for (int i = 0; i < array.length; i++) {
            print("Set " + (i+1) + " element:");
            array[i] = scanConsole();
        }
        return array;
    }
}

