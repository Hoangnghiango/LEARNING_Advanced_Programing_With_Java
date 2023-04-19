package Lesson03_Array_Method;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int[] arr = createArray(3);
        int max = max(arr);
        System.out.println(max);
    }
    public static int[] createArray(int size){
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of array: ");
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max< arr[i]){
                max = arr[i];
            }

        }
        return max;


    }
}
