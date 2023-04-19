package TITV.Java_37;

public class Test {
    public static void main(String[] args) {
        NgaySinh ngaySinh = new NgaySinh(12,12,2019);
        NgaySinh ngaySinh1 = new NgaySinh(23,2,2016);
        NgaySinh ngaySinh2 = new NgaySinh(1,4,2013);

        Lop C0223H1 = new Lop("Lap trinh java", "Khoa cong nghe thong tin");
        Lop C0223H2 = new Lop("Lap trinh python", "Khoa cong nghe thong tin 2");
        Lop C0223H3 = new Lop("Lap trinh javascript", "Khoa cong nghe thong tin 3");

        Sinhvien sv1 = new Sinhvien("FHFHF","Ngo Thi Hoang Nghia",ngaySinh ,9.0,C0223H1);
        Sinhvien sv2 = new Sinhvien("KKKKK","Ngo Thi Hoang lINH",ngaySinh1 ,8.0,C0223H2);
        Sinhvien sv3 = new Sinhvien("KKJJJJ","Ngo Thi HI lINH",ngaySinh1 ,7.0,C0223H3);

        System.out.println(sv1.tenKhoa());
        System.out.println(sv2.tenKhoa());
        System.out.println(sv3.tenKhoa());

    }
}
