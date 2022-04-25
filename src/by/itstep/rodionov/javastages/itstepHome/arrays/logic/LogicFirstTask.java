package by.itstep.rodionov.javastages.itstepHome.arrays.logic;

import java.util.Arrays;

import static by.itstep.rodionov.javastages.itstepHome.arrays.utilites.arrayUtils.*;

//Будет ли создаваться  новый объект!!!!???
public class LogicFirstTask {
    public static int[] createArrayRandom () {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rnd.nextInt(10)+1;
        }
        return array;
    }

    public static int[] concatArrays(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        System.arraycopy(a,0,array,0,a.length);
        System.arraycopy(b,0,array,a.length,b.length);
        return array;
    }

    public static int[] deleteRepeats(int[] array) {
        int zeroNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    array[i] = 0;
                    zeroNumbers++;
                    break;
                }
            }
        }
        int size = array.length - zeroNumbers;
        int[] newArray = new int[size];
        size = 0;
        for (int j : array) {
            if (j != 0) newArray[size++] = j;
        }
        return newArray;
    }

    public static int[] createArrayEqualElements(int[] a, int [] b) {
        int count = 0;
        for (int i : a) {
            for (int j : b) {
                if (j == i) {
                    count++;
                    break;
                }
            }
        }
        int[] newArray = new int[count];
        for (int i: a) {
            for (int j : b) {
                if (i == j) {
                    newArray[--count] = i;
                    break;
                }
            }
        }
        return newArray;
    }
}
