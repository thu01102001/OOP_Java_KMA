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
public class SinhVien{
    public String hoTen;
    public int namSinh;
    public int tuoi;
    public String lop;
    public SinhVien() {
        
    }
    public SinhVien(String hoTen, int namSinh, int tuoi, String lop) {
        hoTen = this.hoTen;
        namSinh = this.namSinh;
        tuoi = this.tuoi;
        lop = this.lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên sv: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập năm sinh sv: ");
        namSinh = sc.nextInt();
        System.out.println("Nhập tuổi sv: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập lớp sv: ");
        lop = sc.nextLine();
    }
    
}
