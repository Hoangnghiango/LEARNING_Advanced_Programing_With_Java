package Lesson06_Inheritance.Shape;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.0);
        System.out.println(square);

        square = new Square("PINK", true, 5.0);
        System.out.println(square.getArea());

    }
}
