package by.itstep.rodionov.javastages.stage11.logic;

public class LogicForStage11 {

    public static boolean isNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int findNumberOfNumerals(int number) {
        int c = 0;
        while (number != 0 ){
            number /= 10;
            c++;
        }
        return c;
    }

    public static int findSumOfNumerals(int number){
        int num = 0;
        while (number != 0){
            num += number%10;
            number /=10;
        }
        return num;
    }

    public static int findNumberOfDifferentNumerals(int number){

        int rememberNumber = number;

        int numberOfNumerals =0;
        while (number !=0){
            number /=10;
            numberOfNumerals++;
        }

        int[] array = new int[numberOfNumerals];

        for (int i = 0; i < array.length; i++) {
            array[i] = rememberNumber%10;
            rememberNumber/= 10;
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
}
