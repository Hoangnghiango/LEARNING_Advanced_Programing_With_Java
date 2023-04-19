package Lesson03_Array_Method;

import java.util.Scanner;

public class Delete_Element_In_Array {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng số nguyên
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Nhập phần tử cần xoá
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        // Tìm vị trí của phần tử X trong mảng
        int index = findIndex(array, X);
        if (index == -1) {
            System.out.println("Không tìm thấy phần tử X trong mảng.");
        } else {
            System.out.println("Phần tử X xuất hiện ở vị trí " + index);
        }

        // Xoá phần tử X khỏi mảng và in ra mảng sau khi xoá
        int[] newArray = removeElement(array, X);
    }
    //  // Phương thức tìm vị trí của phần tử X trong mảng array
    public static int findIndex(int[] array, int X){
        int index_del =-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]== X ){
                index_del = i;
                break;
            }
        }
        return index_del;
    }
    // Phương thức xoá phần tử X khỏi mảng array
    public static int[] removeElement(int[] array, int X){
        int index = findIndex(array, X);
        if(index ==-1){
            System.out.println("Khong tim thay phan tu X trong mang");
            return array;
        }else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            //mang sau khi xoa phan tu X:
            System.out.println("Mang sau khi xoa phan tu X:");
            for (int i = 0; i < array.length-1; i++) {
                System.out.println(array[i]+ " ");
            }
            return array;
        }

    }






}
