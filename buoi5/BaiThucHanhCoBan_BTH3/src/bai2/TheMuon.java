/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class TheMuon extends SinhVien{
    public String soPhieu;
    public String ngayMuon;
    public String hanTra;
    public TheMuon() {
        
    }
    public TheMuon(String hoTen, int namSinh, int tuoi, String lop, String soPhieu, String ngayMuon, String hanTra) {
        super(hoTen, namSinh, tuoi, lop);
        soPhieu = this.soPhieu;
        ngayMuon = this.ngayMuon;
        hanTra = this.hanTra;
    }

    public String getSoPhieu() {
        return soPhieu;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setSoPhieu(String soPhieu) {
        this.soPhieu = soPhieu;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập số phiếu mượn: ");
        soPhieu = sc.nextLine();
        System.out.println("Nhập ngày mượn: ");
        ngayMuon = sc.nextLine();
        System.out.println("Nhập hạn trả: ");
        hanTra = sc.nextLine();
    }
    public void xuat() {
        System.out.println("------------------Phiếu mượn------------------");
        System.out.println("Thông tin: " +
                "\n Họ tên: " +super.getHoTen()+
                "\n Năm sinh: " +super.getNamSinh()+
                "\n Tuổi: " +super.getTuoi()+
                "\n Lớp: " +super.getLop()+
                "\n Số phiếu mượn : " +this.getSoPhieu()+
                "\n Ngày mượn: " +this.getNgayMuon()+
                "\n Hạn trả: " +this.getHanTra());
    }
}
