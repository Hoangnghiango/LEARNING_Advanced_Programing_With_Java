package Lesson06_Inheritance.Circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0, "pink");
        System.out.println(circle);
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, "yellow", 5.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getTheTich());
    }
}
