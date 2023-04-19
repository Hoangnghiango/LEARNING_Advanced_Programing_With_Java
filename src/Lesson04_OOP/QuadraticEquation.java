package Lesson04_OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(double a, double b, double c){
        return b*b - 4*a*c ;
    }
    public double getRoot1(double delta, double a,double b){
        return (-b - Math.sqrt(delta)/ 2*a);

    }
    public double getRoot2(double delta, double a,double b){
        return (-b + Math.sqrt(delta)/ 2*a);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        QuadraticEquation cal = new QuadraticEquation(a,b,c);
        double delta = cal.getDiscriminant(a,b,c);
        if(delta >0){
            System.out.println(cal.getRoot1(delta,a,b));
            System.out.println(cal.getRoot2(delta,a,b));
        }else if(delta==0){
            cal.getRoot1(delta,a,b);
        }else {
            System.out.println("Vo nghiem");
        }





    }
}
