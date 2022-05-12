package by.itstep.rodionov.javastages.itstepHome.arrays.logic;

public class BinarySearch {
    public static int findIndex(int[] array, int number) {
        int min = 0;
        int max = array.length;
        while (array[(max+min)/2] != number && min <= max){
            if(array[(max+min)/2] > number){
                max = (max+min)/2;
            }
            else if(array[(max+min)/2] < number){
                min = (max+min)/2;
            } else return -1;
        }
        return (max+min)/2;
    }
}
