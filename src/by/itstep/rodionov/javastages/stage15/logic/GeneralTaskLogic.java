package by.itstep.rodionov.javastages.stage15.logic;

public class GeneralTaskLogic {
    public static int findGroupWithMaxMarks(double[] avgArray) {
        int maxIndex = 0;
        for (int i = 1; i < avgArray.length; i++) {
            if(avgArray[i]>avgArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static double[] createAvgMarksArray (int[][] groupMarksArray){
        double[] avgArray = new double[groupMarksArray.length];

        for (int i = 0; i < groupMarksArray.length; i++) {
            double sum = 0;
            for (int j = 0; j < groupMarksArray[i].length; j++) {
                sum += groupMarksArray[i][j];
            }
            avgArray[i] = sum/groupMarksArray[i].length;
        }
        return avgArray;
    }

    public static int findGroupWithMaxAmountOfMark (int[][] array, int mark){
        int count;
        int maxAmount = 0;
        int groupIndex = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == mark) count++;
            }
            if(count>maxAmount){
                maxAmount = count;
                groupIndex = i;
            }
        }
        return groupIndex;
    }

    public static int[] includesBadMarks (int[][] array){
        int[] groupsWithBadMarks = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1 || array[i][j] == 2) {
                    groupsWithBadMarks[i] = i+1;
                    break;
                }
            }
        }
        return groupsWithBadMarks;
    }

    public static double findAvg (int[][] array){
        int sum = 0;
        for (int[] elem:array) {
            for (int elem1: elem) {
                sum += elem1;
            }
        }
        return (double)sum/(array.length* array[0].length);
    }

    public static void enlargeMarks (int[][] array){
        double[] avgMarksArray = createAvgMarksArray(array);
        double avgAcademyMark = findAvg(array);
        for (int i = 0; i < avgMarksArray.length; i++) {
            if (avgMarksArray[i]>avgAcademyMark){
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] += 1;
                }
            }
        }
    }

    public static void sortArray (int[] array){
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void sortGroupsAscending (int[][] array){
        for (int[] ints : array) {
            sortArray(ints);
        }
    }

    public static int[] concatTwoSortedArrays (int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int a1 = 0, a2 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (a1 == array1.length){
                for (;i < array3.length && a2 < array2.length; i++, a2++){
                    array3[i] = array2[a2];
                } break;
            }else if (a2 == array2.length){
                for (;i < array3.length && a1 < array1.length; i++, a1++){
                    array3[i] = array1[a1];
                } break;
            }
            if (a1< array1.length && array1[a1] < array2[a2]) {
                array3[i] = array1[a1];
                a1++;
            } else if (array1[a1] > array2[a2]) {
                array3[i] = array2[a2];
                a2++;
            } else {
                array3[i] = array3[i + 1] = array1[a1];
                a1++;
                a2++;
                i++;
            }
        }
        return array3;
    }

}
