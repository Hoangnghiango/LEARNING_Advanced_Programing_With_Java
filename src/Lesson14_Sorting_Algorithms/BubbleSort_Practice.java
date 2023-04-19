package Lesson14_Sorting_Algorithms;

import java.util.Scanner;

public class BubbleSort_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " Value: " );
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println("\n Begin sort processing...");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if(list[j] > list[j+1]){
                    System.out.println("Swap " + list[j] + " with " + list[j+1]);
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
            if(needNextPass == false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();

        }
    }

}
