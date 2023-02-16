package Control;

import Model.DonHang;
import Model.KhachHang;
import Model.MatHang;
import Model.NhanVien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Input {
    public Input(){}
    private QuanLi quanLi = new QuanLi();
    private static FileReader reader;
    private static BufferedReader input;
    public void inputNhanVien() throws Exception
    {
        // nhập danh sách nhân viên
        reader = new FileReader("C:\\Documents\\java\\Java-buoi-3\\NV.DAT");
        input = new BufferedReader(reader);
        String str;
        str = input.readLine();
        while (true)
        {
            NhanVien nhanVien = new NhanVien();
            nhanVien.setTen(str);
            str=input.readLine();
            nhanVien.setID(str);
            nhanVien.setLoaiNhanVien(str);
            str = input.readLine();
            nhanVien.setDiaChi(str);
            str = input.readLine();
            nhanVien.setSDT(str);
            quanLi.addNhanVien(nhanVien);
            if ((str = input.readLine()) == null)
            {
                break;
            }
        }
        input.close();
        reader.close();
    }

    public void inputKhachHang() throws Exception
    {
        // nhập danh sách khách hàng
        reader = new FileReader("C:\\Documents\\java\\Java-buoi-3\\KH.DAT");
        input = new BufferedReader(reader);
        String str;
        str = input.readLine();
        while (true)
        {
            KhachHang khachHang = new KhachHang();
            khachHang.setTen(str);
            str = input.readLine();
            khachHang.setID(str);
            str = input.readLine();
            khachHang.setDiaChi(str);
            str = input.readLine();
            khachHang.setSDT(str);
            quanLi.addKhachHang(khachHang);
            if ((str = input.readLine()) == null)
            {
                break;
            }
        }
        input.close();
        reader.close();
    }
    public void inputMatHang () throws Exception
    {
        //nhập danh sách mặt hàng
        reader = new FileReader("C:\\Documents\\java\\Java-buoi-3\\MH.DAT");
        input = new BufferedReader(reader);
        String str = input.readLine();
        while (true)
        {
            MatHang matHang = new MatHang();
            matHang.setTen(str);
            str = input.readLine();
            matHang.setNhomHang(Integer.parseInt(str));
            str = input.readLine();
            matHang.setGiaBan(Integer.parseInt(str));
            quanLi.addMatHang(matHang);
            if ((str = input.readLine()) == null)
            {
                break;
            }
        }
        input.close();
        reader.close();
    }

    public void inputDonHang () throws Exception
    {
        reader = new FileReader("C:\\Documents\\java\\Java-buoi-3\\ĐH.DAT");
        input = new BufferedReader(reader);
        String str;
        str = input.readLine();
        while (true)
        {
            DonHang donHang = new DonHang();
            donHang.setIDMatHang (str);
            str = input.readLine();
            donHang.setIDKhachHang(str);
            str = input.readLine();
            donHang.setIDNhanVien(str);
            quanLi.addDonHang(donHang);
            if ((str = input.readLine()) == null)
                break;
        }
    }
}
