package Model;

public class NhanVien extends Person {
    public NhanVien() {}

    private String loaiNhanVien;
    private float luong = 0.f ;

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public float getLuong() {
        return luong;
    }
    public void setLuong(int giaDonHang) {
        if (this.loaiNhanVien == "Part Time") this.luong+= giaDonHang / 20;
        else this.luong+= giaDonHang / 10;
    }
    public void setLoaiNhanVien(String ID) {
        if (ID.charAt(0) == 'P') this.loaiNhanVien = "Part Time";
        else this.loaiNhanVien = "Full Time";
    }

    public String toString()
    {
        return "Nhan vien " + getLoaiNhanVien() + super.toString() + "\nLuong: " + getLuong() + "\n";
    }
}
