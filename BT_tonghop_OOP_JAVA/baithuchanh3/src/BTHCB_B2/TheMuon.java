/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHCB_B2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class TheMuon extends SinhVien{
    public int soPhieuMuon;
    public String ngayMuon;
    public String hanTra;
    public int soHieuSach;
    public TheMuon() {
        
    }
    public TheMuon(String hoTen, int namSinh, int tuoi, String lop, int soPhieuMuon, String ngayMuon, String hanTra, int soHieuSach) {
        super(hoTen, namSinh, tuoi, lop);
        soPhieuMuon = this.soPhieuMuon;
        ngayMuon = this.ngayMuon;
        hanTra = this.hanTra;
        soHieuSach = this.soHieuSach;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phiếu mượn: ");
        soPhieuMuon = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập ngày mượn: ");
        ngayMuon = sc.nextLine();
        System.out.println("Nhập hạn trả: ");
        hanTra = sc.nextLine();
        System.out.println("Nhập số hiệu sách: ");
        soHieuSach = sc.nextInt();
        super.nhap();
        sc.close();
    }
    public void xuat(){
        System.out.println("----------PHIẾU MƯỢN----------");
        System.out.println("Họ tên: " +super.getHoTen());
        System.out.println("Năm sinh: " +super.getNamSinh());
        System.out.println("Tuổi: " +super.getTuoi());
        System.out.println("Lớp: " +super.getLop());
        System.out.println("Số phiếu mượn: " +this.getSoPhieuMuon());
        System.out.println("Ngày mượn: " +this.getNgayMuon());
        System.out.println("Hạn trả: " +this.getHanTra());
        System.out.println("Số hiệu sách: " +this.getSoHieuSach());
    }
}
