package TITV.Java_35;

public class Test {
    public static void main(String[] args) {
        Ngay ngay = new Ngay(21,2,2019);
        Ngay ngay2 = new Ngay(1,1,2023);
        Ngay ngay3 = new Ngay(23,4,2021);

        TacGia tacGia1 = new TacGia("Nguyen Truong Sinh", ngay);
        TacGia tacGia2 = new TacGia("Nguyen Truong Loc", ngay2);
        TacGia tacGia3 = new TacGia("Nguyen Loc", ngay3);

        Sach tieuThuyet = new Sach("Hay den ben anh", 30000, 2023, tacGia1);
        Sach truyenTinh = new Sach("Mua cuoi", 10000, 2019, tacGia2);
        Sach nhungKeCoDon = new Sach("nhung ke co don", 100000, 2023, tacGia3);
        tieuThuyet.intenSach();
        truyenTinh.intenSach();
        nhungKeCoDon.intenSach();
        System.out.println(tieuThuyet.cungNamXuatBan(truyenTinh));
        System.out.println(tieuThuyet.cungNamXuatBan(nhungKeCoDon));
        System.out.println(truyenTinh.cungNamXuatBan(nhungKeCoDon));

        System.out.println( "Sach tieu thuyet sau khi giam 30%: "+tieuThuyet.giaSauKhiGiam(30));
        System.out.println("Sach tieu thuyet sau khi giam 50%: "+ tieuThuyet.giaSauKhiGiam(50));




    }
}
