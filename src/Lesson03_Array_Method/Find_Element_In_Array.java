package Lesson03_Array_Method;

import java.util.Scanner;

public class Find_Element_In_Array {
    public static void main(String[] args) {
        String[] students = {"Hoang","nghia","Ngo","Phuc"};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String input_Name = sc. nextLine();
        boolean isFound =false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(input_Name)){
                isFound = true;
                System.out.println(input_Name + " is found in the array");
                break;

            }
        }
        if(isFound==false){
            System.out.println("Not find the input name in the array");
        }
    }
}
