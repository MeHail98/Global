package by.itstep.rodionov.javastages.itstepHome.arrays.utilites;

import java.util.Random;

public class arrayUtils {
    public static Random rnd = new Random();

    public static int[] createArrayWithSize(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10)+1;
        }
        return array;
    }
}
