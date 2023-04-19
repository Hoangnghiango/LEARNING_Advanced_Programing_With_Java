package TITV.Java_37;

public class Sinhvien {
    private String MSSV;
    private String hoVaTen;
    private NgaySinh ngaySinh;
    private double diemTrungBinh;
    private Lop lop;

    public Sinhvien(String MSSV, String hoVaTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
        this.MSSV = MSSV;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String tenKhoa() {
        return this.getLop().getTenKhoa();
    }
}
