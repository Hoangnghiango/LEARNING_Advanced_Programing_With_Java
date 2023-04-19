package Lesson04_OOP;

import java.util.Scanner;

public class Retangle {
    double width, height;
    public Retangle() {
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "Retangle{" + "width=" + width + ", height="+ height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();

        Retangle retangle01 = new Retangle(width, height);
        System.out.println("Your Rectangle \n"+ retangle01.display());
        System.out.println("Perimeter of the Rectangle: "+ retangle01.getPerimeter());
        System.out.println("Area of the Rectangle: "+ retangle01.getArea());

    }
}
