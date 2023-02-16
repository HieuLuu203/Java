import Control.Input;
import Control.QuanLi;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Input in = new Input();
        try
        {
            in.inputNhanVien();
        } catch (Exception e) {

            System.out.println("Thong tin file nhan vien sai");
            return;
        }
        try
        {
            in.inputMatHang();
        } catch (Exception e)
        {
            System.out.println("Thong tin file mat hang sai");
        }
        try
        {
            in.inputKhachHang();
        } catch (Exception e)
        {
            System.out.println("THong itn file khach hang sai");
            return;
        }


        QuanLi quanLi = new QuanLi();
        quanLi.inDanhSach(quanLi.listNhanVien);
        quanLi.inDanhSach(quanLi.listMatHang);
        quanLi.inDanhSach(quanLi.listKhachHang);
    }
}