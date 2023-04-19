package Lesson03_Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class Add_Element_To_Array {

    //git remote add origin https://github.com/Hoangnghiango/LEARNING_Advanced_Programing_With_Java.git
    //git branch -M main
    //git push -u origin main
    public static void main(String[] args) {
        //Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] array = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap phan tu moi:");
        int x = sc.nextInt();
        System.out.println("Nhap vi tri index");
        int index = sc.nextInt();
        int[] newArray = insertNewElementToArray(array,x,index);
        System.out.println(Arrays.toString(newArray));

    }
    public static int[] insertNewElementToArray(int[] array, int X, int index){
        int n = array.length;
        int[] newArray =new int[n+1];
        for (int i = 0; i < array.length; i++) {
            if(index<=-1 || index > array.length-1){
                System.out.println("Khong chen duoc phan tu vao mang");
            }else {
                for (int j = 0; j < index; j++) {
                    newArray[j] = array[j];
                }
                newArray[index] = X;
                for (int j = index+1; j < newArray.length ; j++) {
                    newArray[j] = array[j-1];
                }
            }

        }
        return newArray;

    }
}
