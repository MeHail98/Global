package by.itstep.rodionov.javastages.itstepHome.arrays.controller;

import by.itstep.rodionov.javastages.itstepHome.arrays.logic.LogicFirstTask;
import by.itstep.rodionov.javastages.itstepHome.arrays.logic.LogicSecondTask;
import by.itstep.rodionov.javastages.itstepHome.arrays.logic.LogicThirdTask;

import static by.itstep.rodionov.javastages.itstepHome.arrays.utilites.arrayUtils.*;

import javax.security.auth.login.AccountExpiredException;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    public static void runTaskOne() {
        int[] arr1 = LogicFirstTask.createArrayRandom();
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = LogicFirstTask.createArrayRandom();
        System.out.println(Arrays.toString(arr2));
        int[] arrConcat = LogicFirstTask.concatArrays(arr1,arr2);
        System.out.println(Arrays.toString(arrConcat));
    }

    public static void runTaskOnePointTwo(){
        int[] arr = LogicFirstTask.createArrayRandom();
        System.out.println(Arrays.toString(arr));
        int[] arr2 = LogicFirstTask.createArrayRandom();
        System.out.println(Arrays.toString(arr2));

        arr = LogicFirstTask.deleteRepeats(arr);
        System.out.println(Arrays.toString(arr));
        arr2 = LogicFirstTask.deleteRepeats(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arrConcat = LogicFirstTask.concatArrays(arr, arr2);
        System.out.println(Arrays.toString(arrConcat));

        arrConcat = LogicFirstTask.deleteRepeats(arrConcat);
        System.out.println("Conc arrays without repeats:" + Arrays.toString(arrConcat));
    }

    public static void runTaskOnePointThree(){
        int[] arr = LogicFirstTask.createArrayRandom();
        System.out.println(Arrays.toString(arr));

        int[] arr2 = LogicFirstTask.createArrayRandom();
        System.out.println(Arrays.toString(arr2));

        arr = LogicFirstTask.deleteRepeats(arr);
        System.out.println(Arrays.toString(arr));

        arr2 = LogicFirstTask.deleteRepeats(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arrConcat = LogicFirstTask.createArrayEqualElements(arr,arr2);
        System.out.println(Arrays.toString(arrConcat));
    }

    public static void runTaskTwo(){
        int[] arr = LogicFirstTask.createArrayRandom();
        System.out.println(Arrays.toString(arr));
//        LogicSecondTask.sortArrayPuziriok(arr);
        LogicSecondTask.sortViborom(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void runTaskThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type array size:");
        int size = sc.nextInt();
        int[] array = createArrayWithSize(size);
        System.out.println(Arrays.toString(array));

        LogicThirdTask.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
