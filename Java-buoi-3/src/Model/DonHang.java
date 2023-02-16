package Model;

import java.util.HashSet;

public class DonHang {

    public DonHang() {ID++; IDDonHang = String.format("%06d", ID);}
    public static int ID = 0;
    private String IDMatHang, IDNhanVien, IDKhachHang, thoiGian, IDDonHang;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private MatHang matHang;

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public void setIDMatHang(String IDMatHang) {
        this.IDMatHang = IDMatHang;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getIDMatHang() {
        return IDMatHang;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public String toString ()
    {
        return "Don Hang " + IDDonHang +matHang + khachHang +nhanVien;
    }
}
