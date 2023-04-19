package Lesson05_AccessModifier_staticMethod_StaticProperty.Access_Modifier_Static_Method;

public class ComparableCircle extends  Circle implements  Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()) return 1;
        else if(getRadius() < o.getRadius()) return -1;
        else return 1;

    }
}
