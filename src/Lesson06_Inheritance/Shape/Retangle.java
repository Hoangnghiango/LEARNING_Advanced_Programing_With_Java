package Lesson06_Inheritance.Shape;

public class Retangle extends Shape{
    private double width;
    private double height;

    public Retangle() {
        width = 1.0;
        height = 1.0;
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Retangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String toString(){
        return "A Retangle with width = "
                + getWidth() + "and"
                + "height = "
                + getHeight()
                +" , which is a subclass off"
                +super.toString();

    }
}
