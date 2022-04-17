package by.itstep.rodionov.javastages.stage13.arrayLogic;

import static by.itstep.rodionov.javastages.stage13.util.Utils.*;
import static by.itstep.rodionov.javastages.stage13.arrayLogic.ArrayUtils.*;

public class LogicTask2 {
    public static void runSecondTask(){
        double[] array = createArrayManual();
        String msg = checkIsSorted(array)? "Yes, array is sorted\n": "Array is not sorted\n";
        String msg1 = array.length == 1? ", but consists of only 1 element\n": "\n";
        print(msg+msg1);
    }

    private static boolean checkIsSortedIncreasing(double[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i]<array[i-1]) return false;
        }
        return true;
    }

    private static boolean checkIsSortedDecreasing(double[] array){

        for (int i = 1; i < array.length; i++) {
            if(array[i]>array[i-1]) return false;
        }
        return true;
    }

    public static boolean checkIsSorted(double[] array){
        return checkIsSortedIncreasing(array) || checkIsSortedDecreasing(array);
    }
}
