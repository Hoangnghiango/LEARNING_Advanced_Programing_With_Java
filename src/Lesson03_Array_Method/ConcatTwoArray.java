package Lesson03_Array_Method;

import java.util.Arrays;

public class ConcatTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 ={5,6,7,8,8,9};
        int[] newArr = concatTwoArray(array1,array2);
        System.out.println(Arrays.toString(newArr));

    }
    public static int[] concatTwoArray(int[] arr1, int[] arr2){
        int n = arr1.length;;
        int m = arr2.length;
        int[] newArray = new int[n+m];

            for (int j = 0; j < n; j++) {
                newArray[j] = arr1[j];
            }
            for (int j = 0; j < m; j++) {
                newArray[n+j] = arr2[j];
            }


        return newArray;
    }
}
