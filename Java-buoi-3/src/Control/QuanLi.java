package Control;

import Model.KhachHang;
import Model.MatHang;
import Model.NhanVien;
import Model.DonHang;

import java.util.*;

public class QuanLi {
    public  QuanLi(){}
    public static List <NhanVien> listNhanVien = new ArrayList<NhanVien>();
    public static List <MatHang> listMatHang = new ArrayList<MatHang>();
    public static List <KhachHang> listKhachHang = new ArrayList<KhachHang>();

    public static List <DonHang> listDonHang = new ArrayList<DonHang>();

    public void addNhanVien(NhanVien nhanVien)
    {
        listNhanVien.add(nhanVien);
    }

    public void addMatHang(MatHang matHang)
    {
        listMatHang.add(matHang);
    }
    public void addKhachHang(KhachHang khachHang) {listKhachHang.add(khachHang);}
    public void addDonHang (DonHang donHang)
    {
        donHang.setKhachHang(timKhachHangBangID(donHang.getIDKhachHang()));
        donHang.setMatHang(timMatHangBangID(donHang.getIDMatHang()));
        donHang.setNhanVien(timNhanVienBangID(donHang.getIDNhanVien()));
        listDonHang.add(donHang);

    }
    public <T> void inDanhSach(List <T> list)
    {
        for (T x : list)
            System.out.println(x);
    }

    public NhanVien timNhanVienBangID (String ID)
    {
        for (NhanVien nhanVien : listNhanVien)
        {
            if (nhanVien.getID() == ID)
                return nhanVien;
        }
        return listNhanVien.get(-1);
    }
    public KhachHang timKhachHangBangID ( String ID)
    {
        for (KhachHang khachHang : listKhachHang)
        {
            if (khachHang.getID() == ID)
                return khachHang;
        }
        return listKhachHang.get(-1);
    }

    public MatHang timMatHangBangID ( String ID)
    {
        for (MatHang matHang : listMatHang)
        {
            if (matHang.getMaHang() == ID)
                return matHang;
        }
        return listMatHang.get(-1);
    }


}
