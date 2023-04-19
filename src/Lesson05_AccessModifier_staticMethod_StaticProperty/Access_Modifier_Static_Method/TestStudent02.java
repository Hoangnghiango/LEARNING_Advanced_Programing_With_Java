package Lesson05_AccessModifier_staticMethod_StaticProperty.Access_Modifier_Static_Method;

public class TestStudent02 {
    public static void main(String[] args) {
        Student02 student01 = new Student02();
        System.out.println("Student Info:"+ student01 );
        student01.setName("Marry");
        student01.setClasses("C03");
        System.out.println("Student Info:"+ student01);
        Student02 student02 = new Student02();
        System.out.println("Student Info:"+ student01 );
        student01.setName("Lily");
        student01.setClasses("C04");
        System.out.println("Student Info:"+ student01 );


    }
}
