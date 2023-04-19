package Lesson03_Array_Method;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String newString = sc.nextLine();
        int count = countChar(newString);
        System.out.println(count);

    }
    public static int countChar ( String str){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char you want to find and count");
        char input = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) ==  input){
                count++;
            }

        }
        return count;
    }
}
