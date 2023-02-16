package Model;

public class Person {
    public Person() {}
    protected String ID;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getID() {
        return ID;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    protected String ten;
    protected String diaChi;
    protected String SDT;


    public String toString ()
    {
        return ": " + getTen() + "\nMa Nhan Vien: " + getID() + "\nDia Chi: " + getDiaChi() + "\nSDT: " + getSDT();
    }
}
