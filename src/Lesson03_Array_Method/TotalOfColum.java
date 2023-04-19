package Lesson03_Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class TotalOfColum {
    //Tính tổng các số ở một cột xác định
    public static void main(String[] args) {
        int[][] arrrr = createTwoSideArray();
        System.out.println(Arrays.toString(arrrr));
        int total = totalInOneColumn(arrrr);
        System.out.println(total);

    }
    public static int[][] createTwoSideArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array");
        int row = sc.nextInt();
        System.out.println("Enter the col of the array");
        int col = sc. nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter the element:");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static int totalInOneColumn(int[][] arr){
        int total =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the column you want to calculate");
        int column = sc. nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(j == column){
                    total += arr[i][column];
                }

            }

        }
        return total;
    }
}
