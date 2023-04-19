package Lesson12_Collection_Framework_Map_Tree.HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Ngo Thi Hoang Nghia", 23, "Da nang");
        Student std2 = new Student("Ngo Van Hoang Phuc", 15, "Da nang city");
        Student std3 = new Student("Ngo Thien Quang", 21, "Da nang CT");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,std1);
        studentMap.put(2,std2);
        studentMap.put(3,std3);

        for (Map.Entry<Integer,Student> student : studentMap.entrySet()) {
            System.out.println(student);
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);

        for (Student student: students) {
            System.out.println(student);

        }



    }
}
