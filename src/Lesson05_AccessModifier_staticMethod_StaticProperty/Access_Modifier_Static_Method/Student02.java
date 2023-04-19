package Lesson05_AccessModifier_staticMethod_StaticProperty.Access_Modifier_Static_Method;

public class Student02 {
    private String name;
    private String classes;

    public Student02() {
        name = "John";
        classes = "C02";
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
