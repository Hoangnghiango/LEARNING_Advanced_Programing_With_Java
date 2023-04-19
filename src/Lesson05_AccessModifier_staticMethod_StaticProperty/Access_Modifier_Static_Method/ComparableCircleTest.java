package Lesson05_AccessModifier_staticMethod_StaticProperty.Access_Modifier_Static_Method;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6, "rrrr");
        circles[1] = new ComparableCircle(4.0, "RED");
        circles[2] = new ComparableCircle(5.0, "yellow");
        System.out.println("Pre-sort");

        for (ComparableCircle circle :circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted");
        for (ComparableCircle circle:circles) {
            System.out.println(circle);

        }
    }
}
