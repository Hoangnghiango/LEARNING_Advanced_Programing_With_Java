package Lesson17_BinaryFile_Serialization.APJ_CopyFile.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //Đọc và ghi danh sách sinh viên ra file nhị phân
    //- Viết một ứng dụng cho phép đọc và ghi danh sách học viên ra file nhị phân
    public static void writeDataToFile(String path, List<Student> students) throws FileNotFoundException {
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vu Kieu Anh","Ha Noi"));
        students.add(new Student(2,"Ngo Bao Hoang An", "Da Nang"));
        students.add(new Student(3,"Khi nguoi minh yeu khoc", "HCM"));
        students.add(new Student(4,"Khanh Hoi", "Nha Trang"));
        students.add(new Student(5, "Ngo Thi Hoang Nghia", "Quangn Binh"));
        students.add(new Student(6,"Ngo Thien Quang", "Hoi An"));
        writeDataToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student: studentDataFromFile) {
            System.out.println(student);

        }
    }
}
