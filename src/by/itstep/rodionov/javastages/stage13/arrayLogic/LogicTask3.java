package by.itstep.rodionov.javastages.stage13.arrayLogic;

import static by.itstep.rodionov.javastages.stage13.util.Utils.*;
import static by.itstep.rodionov.javastages.stage13.arrayLogic.ArrayUtils.*;

public class LogicTask3 {
    public static void runThirdTask() {
        double[] array = createArrayManual();
        String msg = isMirrored(array)? "Yes, mirrored array\n": "Not mirrored array\n";
        print(msg);
    }

    public static boolean isMirrored (double[] array){
        return checkIsPossibleToMirror(array)
                &&(checkIsMirroredAvailableMiddle(array) || checkIsMirroredUnavailableMiddle(array));
    }

    public static boolean checkIsPossibleToMirror (double[] array){
        int middle = array.length / 2;
        return array.length % 2 != 0 || array[middle] == array[middle - 1];
    }

    public static boolean checkIsMirroredAvailableMiddle(double[] array) {
        int middle = array.length / 2;
            int indexMax = array.length - 1;
            for (int i = 0; i < middle; i++) {
                if (array[i] != array[indexMax]) return false;
                indexMax--;
        }
        return true;
    }

    public static boolean checkIsMirroredUnavailableMiddle(double[] array) {
        int middle = array.length / 2;
            int indexMax = array.length - 1;
            for (int i = 0; i < middle - 1; i++) {
                if (array[i] != array[indexMax]) return false;
                indexMax--;
            }
        return true;
    }
}



