package Lesson03_Array_Method;

import java.util.Scanner;

public class Convert_The_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit");
        double fahrenheit = sc.nextDouble();
        double convert = FarenheitToCelcius(fahrenheit);
        System.out.println(convert);

    }
    public static double FarenheitToCelcius(double fahrenheit){
       double celcius =  (5.0 / 9) * (fahrenheit - 32);
       return celcius;
    }
}
