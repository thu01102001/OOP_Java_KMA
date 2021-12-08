/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class SinhVien extends Person{
    public String chuyenNganh;
    public float diemQuaTrinh;
    public float diemHocPhan;
    public SinhVien() {
        
    }
    public SinhVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String chuyenNganh, float diemQuaTrinh, float diemHocPhan) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        chuyenNganh = this.chuyenNganh;
        diemQuaTrinh = this.diemQuaTrinh;
        diemHocPhan = this.diemHocPhan;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public float getDiemQuaTrinh() {
        return diemQuaTrinh;
    }

    public float getDiemHocPhan() {
        return diemHocPhan;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setDiemQuaTrinh(float diemQuaTrinh) {
        this.diemQuaTrinh = diemQuaTrinh;
    }

    public void setDiemHocPhan(float diemHocPhan) {
        this.diemHocPhan = diemHocPhan;
    }
    public float getDiemTongKet() {
        return (float) (diemQuaTrinh * 0.3 + diemHocPhan * 0.7);
    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập chuyên ngành: ");
        chuyenNganh = sc.nextLine();
        System.out.println("Nhập điểm quá trình: ");
        diemQuaTrinh = sc.nextFloat();
        System.out.println("Nhập điểm học phần: ");
        diemHocPhan = sc.nextFloat();
    }
    public void getXepHang() {
        if(getDiemTongKet() < 4) {
            System.out.println("Xếp hạng F");
        }
        else if(getDiemTongKet() > 4 && getDiemTongKet() < 5) {
            System.out.println("Xếp hạng D");
        }
        else if(getDiemTongKet() >= 5 && getDiemTongKet() < 6) {
            System.out.println("Xếp hạng C");
        }
        else if(getDiemTongKet() >= 6 && getDiemTongKet() < 8.5) {
            System.out.println("Xếp hạng B");
        }
        else {
            System.out.println("Xếp hạng A");
        }
    }
    @Override
    public String toString() {
        System.out.println("======================");
        return "Sinh viên: " + "\n\t Họ tên: " +super.getHoTen()+
                "\n\t Ngày sinh: " +super.getNgaySinh()+
                "\n\t Địa chỉ: " +super.getDiaChi()+
                "\n\t Giới tính: " +super.getGioiTinh() +
                "\n\t Chuyên ngành: " +this.getChuyenNganh()+
                "\n\t Điểm quá trình: " +this.getDiemQuaTrinh()+
                "\n\t Điểm học phần: " +this.getDiemHocPhan();
    }
    
}
