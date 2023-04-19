package Lesson05_AccessModifier_staticMethod_StaticProperty.Access_Modifier_Static_Method;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "Red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    double getArea(){
        return Math.PI * this.radius * this.radius;

    }
}
