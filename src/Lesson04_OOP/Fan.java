package Lesson04_OOP;

public class Fan {
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = LOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean on(){
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(on){
            return "Speed: " +speed + ",Color: "+ color+ ", Radius: " + radius+ ", Fan is on";
        }else{
            return  "Color: " + color + ", Radius: " +radius+ ", Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        System.out.println("Fan 1: "+ fan1.toString());
        Fan fan2 = new Fan(1,false,5,"Blue");
        System.out.println("Fan 1: "+ fan2.toString());
    }
}
