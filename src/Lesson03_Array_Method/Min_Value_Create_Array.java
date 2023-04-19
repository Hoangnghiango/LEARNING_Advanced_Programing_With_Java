package Lesson03_Array_Method;

import java.util.Scanner;

public class Min_Value_Create_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = sc. nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap gia tri phan tu so+" + i +"trong mang");
            arr[i]= sc.nextInt();
        }
        int minValue = minValue(arr);
        System.out.println(minValue);
    }
    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min = array[i];
            }

        }
        return min;
    }
}
