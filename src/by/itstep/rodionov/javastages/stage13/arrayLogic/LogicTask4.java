package by.itstep.rodionov.javastages.stage13.arrayLogic;

import static by.itstep.rodionov.javastages.stage13.util.Utils.*;
import static by.itstep.rodionov.javastages.stage13.arrayLogic.ArrayUtils.*;

public class LogicTask4 {
    public static void runFourthTask() {
        double[] array = createArrayManual();
        String msg = "It is some random array\n";
        if(areAllElementsDifferent(array)) msg = "All elements are different\n";
        else if(areAllElementsEqual(array)) msg = "All elements are equal\n";
        print(msg);
    }

    public static boolean areAllElementsEqual(double[] array){
        for(int i = 1; i< array.length; i++){
            if(array[i] != array[i-1]) return false;
        }
        return true;
    }

    public static boolean areAllElementsDifferent(double[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] == array[j]) return false;
            }
        }
        return true;
    }
}
