package Lesson06_Inheritance.Point2D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2d = new Point2D(3.4f, 4.5f);
        System.out.println(Arrays.toString(point2d.getXY()));

        Point3D point3d = new Point3D(1.2f,2.2f, 3.3f);
        System.out.println(Arrays.toString(point3d.getXYZ()));
    }
}
