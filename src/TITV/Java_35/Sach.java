package TITV.Java_35;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void intenSach() {
        System.out.println("Ten sach la: " + this.tenSach);
    }

    public boolean cungNamXuatBan(Sach o) {
//        if(this.getNamXuatBan() == o.getNamXuatBan()){
//            return true;
//        }else {
//            return false;
//        }
        return this.getNamXuatBan() == o.getNamXuatBan();
    }

    public double giaSauKhiGiam(double x) {
        return this.giaBan*(100-x)/100;
    }
}
