package by.itstep.rodionov.javastages.stage13.arrayLogic;

import java.util.Arrays;

import static by.itstep.rodionov.javastages.stage13.util.Utils.*;
import static by.itstep.rodionov.javastages.stage13.arrayLogic.ArrayUtils.*;

public class LogicTask1 {

    public static void runFirstTask() {
        double[] array = createArrayManual();
        print("Min value is " + findMin(array) + "\n\n");
        print("Array with min and max value swapped: " + Arrays.toString(swapMinMax(array)) + "\n\n");
        if (array.length == 1) {
            print("Array consists of 1 element only, no point in multiplying and summation\n");
        } else {
            print("Sum of elements which are bigger than average: " + findSum(array) + "\n");
            print("Array elements in even places multiplied by each other: " + findMultiplication(array) + "\n");
        }
    }

    public static double findMin(double[] array){
        double min = Double.MAX_VALUE;
        for (double elem:array) {
            if (elem<min) min = elem;
        }
        return min;
    }

    public static double[] swapMinMax(double[] array){
        int indexMax = 0;
        int indexMin= 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]>array[indexMax]) indexMax = i;
            else if (array[i]<array[indexMin]) indexMin = i;
        }
        double temp = array[indexMax] ;
        array[indexMax] = array[indexMin];
        array[indexMin] = temp;
        return array;
    }

    //найти сумму всех элементов, абсолютная величина которых меньше среднего арифметического всех элементов
    public static double findSum (double[] array){
        double sumOfElements = 0;
        for (double element:array) {
            sumOfElements +=element;
        }
        double avg = sumOfElements/array.length;

        sumOfElements = 0;
        for (double element:array) {
            element = element<0? -element: element;
            if (element<avg) sumOfElements += element;
        }
        return sumOfElements;
    }

    //найти произведение всех положительных элементов,которые стоят на чётных местах
    public static double findMultiplication(double[] array){
        double multiplication = 1;
        for (int i = 1; i<array.length; i = i+2) {
            if(array[i]>0) multiplication *= array[i];
        }
        return multiplication;
    }
}
