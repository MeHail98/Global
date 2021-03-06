package by.itstep.rodionov.javastages.stage15.controller;

import static by.itstep.rodionov.javastages.stage15.logic.AdditionalTaskLogic.*;
import java.util.ArrayList;
import java.util.Arrays;
import static by.itstep.rodionov.javastages.stage15.utilites.ArrayLogic.*;
import static by.itstep.rodionov.javastages.stage15.logic.GeneralTaskLogic.*;
import static by.itstep.rodionov.javastages.stage15.utilites.PrintScan.*;

public class Controller {
    public static void runGeneralOne(){
        print("Type number of groups(positive integer):");
        int groups = securedInput();

        print("Type number of students in group(positive integer):");
        int students = securedInput();

        int[][] groupMarksArray = createTwoDimensionArray(groups,students);
        for (int i = 0; i < groupMarksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(groupMarksArray[i]));
        }

        double[] avgMarksArray = createAvgMarksArray(groupMarksArray);
        print("Average marks array: " + Arrays.toString(avgMarksArray));

        int groupWithHighestMarks = findGroupWithMaxMarks(avgMarksArray);
        print("Group with max mark:" + (groupWithHighestMarks+1));
    }

    public static void runGeneralTwo(){
        print("Type number of groups(positive integer):");
        int groups = securedInput();

        print("Type number of students in group(positive integer):");
        int students = securedInput();

        print("Type a mark to find group with the biggest amount of it (positive integer):");
        int mark = -1;
        while (mark>10 || mark<0){
            mark = securedInput();
            if (mark>10 || mark<0) print("Please type a mark from 1 to 10:");
        }

        int[][] marksArray = createTwoDimensionArray(groups,students);
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }

        int groupWithMaxAmountOfMark = findGroupWithMaxAmountOfMark(marksArray,mark);
        print("Group with max amount of this mark: " + (groupWithMaxAmountOfMark+1));

    }

    public static void runGeneralThree(){
        print("Type number of groups(positive integer):");
        int groups = securedInput();

        print("Type number of students in group(positive integer):");
        int students = securedInput();

        int[][] groupMarksArray = createTwoDimensionArray(groups,students);
        for (int i = 0; i < groupMarksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(groupMarksArray[i]));
        }

        int[] arrayBadMarks = includesBadMarks(groupMarksArray);
        print("Groups with bad marks: ");
        for (int element:arrayBadMarks) {
            if(element != 0) print("" + element);
        }
    }

    public static void runGeneralFour(){
        print("Type number of groups(positive integer):");
        int groups = securedInput();

        print("Type number of students in group(positive integer):");
        int students = securedInput();

        int[][] marksArray = createTwoDimensionArray(groups,students);
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }

        print("Average academy mark: " + findAvg(marksArray));

        enlargeMarks(marksArray);
        print("Enlarged marks:");
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }
    }

    public static void runGeneralFive (){
        print("Type number of groups(positive integer):");
        int groups = securedInput();

        print("Type number of students in group(positive integer):");
        int students = securedInput();

        int[][] marksArray = createTwoDimensionArray(groups,students);
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }

        sortGroupsAscending(marksArray);
        print("Sorted marks:");
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }
    }

    public static void runAdditionalA(){
        print("Type number of groups(positive integer):");
        int groups = securedInput();

        print("Type number of students in group(positive integer):");
        int students = securedInput();

        int[][] marksArray = createTwoDimensionArray(groups,students);
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }

        ArrayList<Integer> list = findColumnsWithAllEvenEl(marksArray);
        print("Columns with all even el:" + list);

        ArrayList<Integer> MinusList = findDiagonalsWithMinusEl(marksArray);
        print("Columns with minus elements on diagonal:" + MinusList);

        if(!MinusList.isEmpty()){
        for (int i = 0; i < marksArray.length; i++) {
            if(marksArray[i][i]<0) print("sum of " + (i+1) + " column elements = " + findSum(marksArray[i]));
            }
        }
    }

    public static void runAdditionalB(){
        print("Type number of groups(positive integer):");
        int groups = securedInput();

        print("Type number of students in group(positive integer):");
        int students = securedInput();

        int[][] marksArray = createTwoDimensionArray(groups,students);
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }

        marksArray = transposeMatrixNotSymmetric(marksArray);
        print("Transposed matrix:");
        for (int i = 0; i < marksArray.length; i++) {
            print(i+1 + " group marks: " + Arrays.toString(marksArray[i]));
        }
    }

    public static void runAdditionalC(){
//        ???????? ?????? ???????????????????????????? ???????????????????? ?????????????? ?????????????? n. ???????????????? ?????????? ?????????????? ???????????????????? ?????????????????? ????????????
//        ???????????? ???????????? ?????????????? ???? ???????????????????? ???? ???????????????? ?????????????????? ?????????????????????????????? ???????????? ???????????? ??????????????.

        print("Type scope of two Matrix:");
        int scope = securedInput();
        int[][] matrix = createSymmetricMatrix(scope);
        int[][] matrix2 = createSymmetricMatrix(scope);

        print("First matrix:");
        for (int[] subMatrix : matrix) {
            print(Arrays.toString(subMatrix));
        }
        print("Second matrix:");
        for (int[] subMatrix:matrix2) {
            print(Arrays.toString(subMatrix));
        }

        int[][] multipliedMatrix = createNewMatrixMultiplication(matrix,matrix2);
        print("New matrix with elements multiplication:");
        for (int[] subMatrix:multipliedMatrix) {
            print(Arrays.toString(subMatrix));
        }
    }

    public static void runGeneral (){
        //???????????????????????????????? ?????? ?????????????????????????????? ??????????????, ?????????? ?????????? ???????????? ?????? ?????????? ????????????????????????, ?????? ??????????????????????????
        //?????????? ???????????????????? ???????????? ??????????????
        int[] a = {1,4,5,7,8};
        int[] b = {3,6,6,9,10};
        print(Arrays.toString(a) + "\n" + Arrays.toString(b));
        int[] c = concatTwoSortedArrays(a,b);
        print(Arrays.toString(c));
    }

    public static int runRecursion(int n) {
//        ?????????? N ?????????? ?????????? ????????????????(?????????????????????? ?????????? ?? ?? ?? ?? ???????????????????? ?????????????? ????????????????,
//        ???????? ?????????????????????? ???????????????? a ?????????????? + b ?????????????? = ??)
        int count = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                for (int k = 2; k < n; k++) {
                    if (k * k + j * j == i * i) {
                        count++;
                        System.out.printf("%d*%d + %d*%d = %d*%d\n", k, k, j, j, i, i);
                    }
                }
            }
        }
        return count;
    }

        public static int Recursion(int n) {
        int count = 0;
        if (n < 5) return 0;
        else {
            for (int i = 2; i < n; i++) {
                for (int j = 2; j < n; j++) {
                    if(i*i + j*j == n*n){
                        count++;
                        System.out.printf("%d*%d + %d*%d = %d*%d\n",i,i,j,j,n,n);
                }
            }
        }
            return count + runRecursion(n-1);
        }
    }

    public static double sequence(int x, int n) {
        if(n == 1) return x;
        return (x * sequence (x,n-1) / n);
    }

    public static int multiple(int x, int n) {
        if (n == 1) return x;
        return (x*multiple(x, n-1));
    }
}
