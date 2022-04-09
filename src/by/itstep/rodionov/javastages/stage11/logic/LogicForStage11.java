package by.itstep.rodionov.javastages.stage11.logic;

import java.util.Arrays;
import java.util.Random;

import static by.itstep.rodionov.javastages.stage11.util.Util.print;
import static by.itstep.rodionov.javastages.stage11.util.Util.read;

public class LogicForStage11 {

    static Random random = new Random();

    public static boolean isNaturalNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            if (Integer.parseInt(s) < 0) return  false;
            return Integer.parseInt(s) <= 2147483646;
        } catch (NumberFormatException i) {
            return false;
        }
    }


    public static int checkConsoleInput() {
        boolean boolNumber = false;
        String number = "";
        while (!boolNumber) {
            print("Type a number: ");
            number = read();
            boolNumber = isNaturalNumber(number);
            if (!boolNumber) print("Not appropriate number, please try again\n");
        }
        return Integer.parseInt(number);
    }


    public static int findNumberOfNumerals(int number) {
        int count = 0;
        while (number !=0){
            number /=10;
            count++;
        }
        return count;
    }

    public static int findSumOfNumerals(int num){
        int c = 0;
        while (num != 0){
            c += num%10;
            num /=10;
        }
        return c;
    }


    public static int findNumberOfDifferentNumerals(int number){
        String num = Integer.toString(number);

        int[] array = new int[num.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = number%10;
            number/= 10;
        }
        int countEquals;
        int numberOfDifferent = 0;

        for (int i = 0; i < array.length; i++) {
            countEquals = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    countEquals =1;
                    break;
                }
            }
            if (countEquals == 0) numberOfDifferent++;
        }
        return numberOfDifferent;
    }


    public static int findHeadsFall(int num) {

        int randomNumber;
        int countHeads = 0;

        while (num>0){
            randomNumber = random.nextInt(2);
             if (randomNumber==0) countHeads++;
            num--;
        }
        return countHeads;
    }


    public static int invertNumber(int num) {

        int inverted = 0;
        while (num != 0){
            inverted = inverted*10 + num%10;
            num /= 10;
        }
        return  inverted;
    }


    public static boolean checkIsSimple(int num){
        double sqrt = Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public static int findFactorial(int num){
        if(num > 12) return -1;

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public static String findAllSimpleDividers (int num){
        String msg = "";

        for (int i = 2; i <= num/2; i++) {
            if (checkIsSimple(i) && num%i == 0) msg += i + " ";
        }
    return msg;
    }


    public static boolean isArmstrongNumber(int number) {
        String num = Integer.toString(number);
        int[] arr = new int[num.length()];
        int rememberNumber = number;

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i],arr.length);
        }
        return sum == rememberNumber;
    }


    public static String findAllArmstrongNumbers(int number) {
        String msg = "";
        int num = (int)Math.pow(10, number);
        int minNum = (int)Math.pow(10, number-1);
        while (num>minNum){
            if (isArmstrongNumber(num)) msg += num + "  ";
            num--;
        }
        return msg;
    }

    public static int findNOD(int num1, int num2) {
        int NOD = 0;
        int i = 1;
        while (i <= num1 || i <= num2){
            if (num1 % i == 0 && num2%i == 0) NOD = i;
            i++;
        }
        return  NOD;
    }

    public static int findNOK(int num1, int num2){
        int NOK = 0;
        int number = num1*num2;
        while(number>= num1 || number>=num2){
            if (number % num1 ==0 && number% num2 == 0) NOK = number;
            number--;
        }
        return NOK;
    }
}
