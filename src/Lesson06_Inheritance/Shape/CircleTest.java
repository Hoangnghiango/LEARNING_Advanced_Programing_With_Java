package Lesson06_Inheritance.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.0);
        System.out.println(circle);

        circle = new Circle("yellow",false, 4.7);
        System.out.println(circle);
    }
}
