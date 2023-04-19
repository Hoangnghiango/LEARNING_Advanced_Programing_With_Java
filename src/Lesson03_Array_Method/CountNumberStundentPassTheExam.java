package Lesson03_Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberStundentPassTheExam {
    public static void main(String[] args) {
        int[] arr = createScoreArray();
        System.out.println(Arrays.toString(arr));
        int students = countStudentPass(arr);
        System.out.println(students);


    }
    public static int[] createScoreArray(){
        int size;
        int[] scores;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size: ");
            size = sc.nextInt();
            if(size>30){
                System.out.println("Size should not exceed 30");
            }
        } while(size>30);
        scores = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index =" + i);
            scores[i] = sc.nextInt();

        }
        return scores;

    }
    public static int countStudentPass(int[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=5){
                count++;
            }

        }
        return count;
    }
}
