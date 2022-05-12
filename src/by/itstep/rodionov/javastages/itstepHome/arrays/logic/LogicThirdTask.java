package by.itstep.rodionov.javastages.itstepHome.arrays.logic;

public class LogicThirdTask {
    public static void sort(int[] array) {
        sortAscending(0,7,array);
        sortDescending(7, array.length, array);
        }

    public static void sortDescending(int minScope, int maxScope, int[] array) {
        for (int i = minScope; i < maxScope; i++) {
            int maxIndex = i;
            for (int j = i; j < maxScope; j++) {
                if(array[j]>array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp;
            temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public static void sortAscending(int minScope, int maxScope, int[] array){
        for (int i = minScope; i < maxScope; i++) {
            for (int j = i; j < maxScope; j++) {
                if(array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
    }
}
