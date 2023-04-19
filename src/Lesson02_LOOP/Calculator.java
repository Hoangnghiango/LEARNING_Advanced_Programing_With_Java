package Lesson02_LOOP;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money: ");
        money = sc.nextDouble();
        System.out.println("Enter the number of month: ");
        month = sc.nextInt();
        System.out.println("Enter the interest");
        interest = sc. nextDouble();
        double totalInterest =0;
            for (int i = 0; i < month; i++) {
                totalInterest += money * (interest/100)/12*month;

            }
        System.out.println(totalInterest);
    }
}
