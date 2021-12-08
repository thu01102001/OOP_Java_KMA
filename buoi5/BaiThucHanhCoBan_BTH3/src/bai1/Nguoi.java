/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Nguoi {
    public String hoTen;
    public String diaChi;
    public int namSinh;
    public Nguoi(){
        
    }
    public Nguoi(String hoten, String diaChi, int namSinh) {
        hoten = this.hoTen;
        diaChi = this.diaChi;
        namSinh = this.namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
    }
    public void inTT() {
        System.out.println("======================");
        System.out.println("Họ tên: " +this.getHoTen());
        System.out.println("Địa chỉ: " +this.getDiaChi());
        System.out.println("Năm sinh: " +this.getNamSinh());
    }
}
