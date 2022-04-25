package by.itstep.rodionov.javastages.stage15.utilites;

import java.util.Random;

public class ArrayLogic {
    public static Random rnd = new Random();

    public static int[] createArrayRandom (int scope) {
        int[] array = new int[scope];
        for (int i = 0; i < scope; i++) {
            array[i] = rnd.nextInt(10)+1;
        }
        return array;
    }

    public static int[][] createTwoDimensionArray(int scope, int scope2) {
        int[][] array = new int[scope][scope2];
        for (int i = 0; i < scope; i++) {
            array[i] = createArrayRandom(scope2);
        }
        return array;
    }

    public static int[][] createSymmetricMatrix (int scope){
        int[][] array = new int[scope][scope];
        for (int i = 0; i < scope; i++) {
            array[i] = createArrayRandom(scope);
        }
        return array;
    }
}
