package Lesson06_Inheritance.Shape;

public class Circle extends Shape {
    private double radious;

    public Circle() {
        this.radious = 1.0;

    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(String color, boolean filled, double radious) {
        super(color, filled);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    @Override
    public String toString(){
        return "A Circle with radious = "
                + getRadious()
                +", which is a class off "
                + super.toString();

    }
}
