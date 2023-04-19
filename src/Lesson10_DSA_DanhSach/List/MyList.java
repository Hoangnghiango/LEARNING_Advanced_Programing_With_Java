package Lesson10_DSA_DanhSach.List;

public class MyList<E> {
    private int size = 0;
    //size xác định số phần tử trong danh sách, mặc định gán là 0.
    private static final int DEFAULT_CAPACITY = 10;
    //DEFAULT_CAPACITY lưu số phần tử đối đa trong danh sách mặc định là 10.
    private Object elements[];
    //Mảng đối tượng elements chứa các phần tử trong danh sách


    public MyList() {
        //Phương thức khởi tạo không tham số
        elements = new Object[DEFAULT_CAPACITY];
    }
    //Cài đặt phương thức ensureCapa()
    //
    //Mục đích: Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa(){
        int newSize = elements.length * 2;
    }
    //Phương thức thêm một phần tử mới vào danh sách: add()
    //Mục đích: thêm một phần tử vào cuối của danh sách
    //
    //Tham số đầu vào: phần tử cần thêm vào danh sách
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    //Phương thức truy cập một phần tử trong danh sách: get()
    //Mục đích: Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
    //
    //Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách

    public E get(int i){
        if ( i >= size || i < 0 ){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size "+ i);
        }
        return (E) elements[i];
    }




}
