package Lesson06_Inheritance.Shape;

public class RetangleTest {
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        System.out.println(retangle);

        retangle = new Retangle(1.0, 3.0);
        System.out.println(retangle.getPerimeter());

        retangle = new Retangle("pink", true,4.0,6.0);
        System.out.println(retangle.getArea());
    }
}
