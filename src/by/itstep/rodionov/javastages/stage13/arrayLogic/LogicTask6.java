package by.itstep.rodionov.javastages.stage13.arrayLogic;

import static by.itstep.rodionov.javastages.stage13.util.Utils.*;
import static by.itstep.rodionov.javastages.stage13.arrayLogic.ArrayUtils.*;

public class LogicTask6 {
    public static void runSixthTask() {
        double [] array = createArrayManual();
        double[] a = makeMarksPercentageList(array);
        if (a == null) print("Please set real array with marks from 0 to 5");
        else {print(String.format("""
                Zeros: %.1f
                Ones: %.1f
                Twos: %.1f
                Threes: %.1f
                Fourths: %.1f
                Fives: %.1f
                """,a[0],a[1],a[2],a[3],a[4],a[5]));}
    }

    public static double[] makeMarksPercentageList(double [] marks){
        if (marks == null || marks.length<1) return null;

        double [] marksArray = new double[6];
        for (double mark : marks) {
            if(mark<0) return null;
            marksArray[(int) mark] = marksArray[(int) mark] == 0 ? 1 : ++marksArray[(int) mark];
        }
        double [] marksPercentageList = new double[6];
        for(int j = 0; j < marksArray.length; j++){
            marksPercentageList[j] = marksArray[j]/marks.length*100;
        }
        return  marksPercentageList;
    }
}