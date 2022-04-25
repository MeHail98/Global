package by.itstep.rodionov.javastages.stage15.logic;

import java.util.ArrayList;

public class AdditionalTaskLogic {
    public static boolean areAllElementsEven(int[] array) {
        for (int element:array) {
            if(element%2 != 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> findColumnsWithAllEvenEl (int[][] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(areAllElementsEven(array[i])) list.add(i+1);
        }
        return list;
    }

    public static int findSum (int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static ArrayList<Integer> findDiagonalsWithMinusEl(int[][] array){
        ArrayList<Integer> minusList = new ArrayList<>(0);
        if(array.length == array[0].length ){
            for (int i = 0; i < array.length; i++) {
                if(array[i][i]<0) minusList.add(i+1);
            }
        }
        return minusList;
    }

    public static void transposeMatrixSymmetric (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    public static int[][] transposeMatrixNotSymmetric(int[][]array){
        int[][] newArray = new int[array[0].length][array.length];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }

    public static int[][] createNewMatrixMultiplication (int[][] array, int[][]array1){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] =array[i][j] * findMaxInline(array1,i);
            }
        }
        return array;
    }

    public static int findMaxInline(int[][] array, int index){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i< array.length;i++) {
            if (array[index][i] > maxValue) maxValue = array[index][i];
        }
        return maxValue;
    }
}
