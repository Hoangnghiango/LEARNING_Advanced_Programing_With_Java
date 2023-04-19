package Lesson06_Inheritance.Circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        this.height = 2.0;

    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getTheTich(){
        return super.getArea() * height;
    }

    @Override
    public String toString(){
        return "The cylinder has "
                + getRadius()
                +" "
                +getHeight()
                + "area"
                + getArea()
                + "and the tich"
                + getTheTich();
    }
}
