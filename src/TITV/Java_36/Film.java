package TITV.Java_36;

public class Film {
    private String filmName;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private  int giaVe;
    private NgayChieu ngayChieu;

    public Film(String filmName, int namSanXuat, HangSanXuat hangSanXuat, int giaVe, NgayChieu ngayChieu) {
        this.filmName = filmName;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean kiemTraGiaVe(Film o) {
        return this.getGiaVe() > o.getGiaVe();
    }

    public String tenHangSanXuatPhim() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public double giaVeSauKhuyenMai(double x) {
        return this.giaVe * (100 - x) / 100;
    }
}
