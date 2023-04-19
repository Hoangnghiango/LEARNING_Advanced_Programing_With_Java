package TITV.Java_36;

public class Test {
    public static void main(String[] args) {
        NgayChieu ngay1 = new NgayChieu(19,07,1999);
        NgayChieu ngay2 = new NgayChieu(28,04,2001);
        NgayChieu ngay3 = new NgayChieu(1,4,2008);

        HangSanXuat suzuki = new HangSanXuat("Suzuki", "Han Quoc");
        HangSanXuat honda = new HangSanXuat("Honda", "VietNam");
        HangSanXuat yamaha = new HangSanXuat("Yamaha", "Nhat ban");

        Film film1 = new Film("Toi thay hoa vang tren co xanh",1999,suzuki,30000,ngay1);
        Film film2 = new Film("Bo dau nho con dau to",2001,honda,5000000, ngay2);
        Film film3 = new Film("Ut cung cua nha ta", 2008, yamaha, 300000,ngay3);

        System.out.println(film1.kiemTraGiaVe(film2));
        System.out.println(film2.kiemTraGiaVe(film1));
        System.out.println(film3.kiemTraGiaVe(film2));

        System.out.println(film1.tenHangSanXuatPhim());
        System.out.println(film2.tenHangSanXuatPhim());
        System.out.println(film3.tenHangSanXuatPhim());

        System.out.println(film1.giaVeSauKhuyenMai(20));
        System.out.println(film2.giaVeSauKhuyenMai(20));
        System.out.println(film3.giaVeSauKhuyenMai(20));






    }
}
