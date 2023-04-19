package Lesson10_DSA_DanhSach.List;

public class MyListTest {
    public static void main(String[] args) {
        //Trường hợp 1: Tạo đối tượng listInteger chứa danh sách các số nguyên.
        // Hiển thị các phần tử được thêm vào list theo vị trí và phần tử
        // vượt quá số phần tử được thêm vào.
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("Element 4: " + listInteger.get(4));
        System.out.println("Element 1: " + listInteger.get(1));
        System.out.println("Element 2: " + listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("Element 6:" +listInteger.get(6));

//        listInteger.get(-1);
//        System.out.println("Element -1 : " + listInteger.get(-1));


    }
        }
