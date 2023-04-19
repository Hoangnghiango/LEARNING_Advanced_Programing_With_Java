package Lesson05_AccessModifier_staticMethod_StaticProperty.Access_Modifier_Static_Method;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Dien tich hinh tron 01 la :" +c1.getArea() );
        Circle c2 = new Circle(2.0, "Green");
        System.out.println("Dien tich hinh tron 02 la :" +c2.getArea() );


    }
}
