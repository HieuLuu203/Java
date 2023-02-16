package Model;

public class MatHang {
    public MatHang(){ID++; maHang = String.format("%04d", ID);}
    private static int ID = 0;
    private String ten, maHang, nhomHang;
    private int giaBan;

    public String getTen() {
        return ten;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setNhomHang(int nhomHang) {
        switch (nhomHang)
        {
            case 1:
                this.nhomHang = "Hang thoi trang";
                break;
            case 2:
                this.nhomHang = "Hang tieu dung";
                break;
            case 3:
                this.nhomHang = "Hang dien may";
                break;
            case 4:
                this.nhomHang = "Hang gia dung";
                break;
        }
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String toString ()
    {
        return "Mat hang: " + getTen() + "\nMa mat hang: " + getMaHang() + "\nNhom hang: " + getNhomHang() + "\nGia ban: " + getGiaBan() + "\n";
    }
}
