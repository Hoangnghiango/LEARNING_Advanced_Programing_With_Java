package TITV.Lesson34;

public class Test {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(15, 5, 2025);
        MyDate md2 = new MyDate(11, 1, 2021);
        MyDate md3 = new MyDate(15, 5, 2025);
        MyDate md4 = md1;

        System.out.println(md1); // 15/5/2021
        System.out.println(md2);
        System.out.println(md3);

        System.out.println("md1 so sanh md2: " + md1.equals(md2));
        System.out.println("md1 so sanh md3: " + md1.equals(md3));
        System.out.println("md1 so sanh md4: " + md1.equals(md4));
        System.out.println("md3 so sanh md4: " + md3.equals(md4));

        System.out.println("ham bam cua md1: " + md1.hashCode());
        System.out.println("ham bam cua md2: " + md2.hashCode());
        System.out.println("ham bam cua md3: " + md3.hashCode());




    }
}
