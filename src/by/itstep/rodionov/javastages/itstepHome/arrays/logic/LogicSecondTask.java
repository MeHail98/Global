package by.itstep.rodionov.javastages.itstepHome.arrays.logic;

import java.util.Arrays;

public class LogicSecondTask {
    public static void sortArrayPuziriok (int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static int findMinIndex(int[] array, int firstIndex) {
        for (int i = firstIndex+1; i < array.length; i++) {
            if(array[i] < array[firstIndex]){
                firstIndex = i;
            }
        }
        return firstIndex;
    }

    public static void sortViborom(int[] array) {
        Arrays.sort(array);
        int minIndex;
        int temp;
        for (int i = 0; i < array.length; i++) {
            minIndex = findMinIndex(array,i);
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
