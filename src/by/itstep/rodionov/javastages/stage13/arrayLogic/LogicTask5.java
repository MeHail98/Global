
package by.itstep.rodionov.javastages.stage13.arrayLogic;

import static by.itstep.rodionov.javastages.stage13.util.Utils.*;
import static by.itstep.rodionov.javastages.stage13.arrayLogic.ArrayUtils.*;

public class LogicTask5 {
    public static void runFifthTask() {
        double[] array = createArrayManual();
        print(String.format("Number of even elements: %d \nNumber of odd elements %d\n"
                ,findNumberOfEven(array),findNumberOfOdd(array)));
    }

    public static byte findNumberOfEven(double[] array) {
        byte count = 0;
        for (double element : array) {
            if (element % 2 == 0) count++;
        }
        return count;
    }

    public static byte findNumberOfOdd(double[] array) {
        byte count = 0;
        for (double element : array) {
            if (element % 2 != 0) count++;
        }
        return count;
    }
}