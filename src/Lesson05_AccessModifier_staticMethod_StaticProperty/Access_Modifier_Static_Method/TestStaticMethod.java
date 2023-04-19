package Lesson05_AccessModifier_staticMethod_StaticProperty.Access_Modifier_Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Hoang Nghia");
        Student s2 = new Student(222,"Phuc Quy");
        Student s3 = new Student(333,"Hai Ro");

        s1.display();
        s2.display();
        s3.display();

        Car car1 = new Car("Mazda", "Z0023");
        System.out.println(car1.numberOfCars);
        Car car2 = new Car("Honda", "Z004423");
        System.out.println(car2.numberOfCars);
        System.out.println(car1.numberOfCars);

    }

}
