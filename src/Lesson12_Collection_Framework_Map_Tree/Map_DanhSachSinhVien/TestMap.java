package Lesson12_Collection_Framework_Map_Tree.Map_DanhSachSinhVien;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //Tạo HashMap trong main để lưu danh sách sinh viên
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nghia", 23);
        hashMap.put("Quynh Anh", 21);
        hashMap.put("Hoang Phuc", 15);
        hashMap.put("Tran Dai", 23);
        hashMap.put("Tony", 11);
        System.out.println("Display Entry in hashMap");
        System.out.println(hashMap +"\n");
        //Bước 3: Tạo TreeMap trong main để lưu key theo thứ tự giảm dần

        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap +"\n");

        //Bước 4: Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
        LinkedHashMap<String, Integer> LinkedHashmap = new LinkedHashMap<>(treeMap);
        System.out.println("\nThe age for " + "Nghia is " + LinkedHashmap.get("Nghia"));
        System.out.println("\nThe age for " + "Quynh Anh is " + LinkedHashmap.get("Quynh Anh"));
        System.out.println("\nThe age for " + "Hoang Phuc is " + LinkedHashmap.get("Hoang Phuc"));
        System.out.println("\nThe age for " + "Tony is " + LinkedHashmap.get("Tony"));



    }
}
