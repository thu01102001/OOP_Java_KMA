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
public class Person {
    public String hoTen;
    public String ngaySinh;
    public String diaChi;
    public String gioiTinh;
    public Person() {
        
    }
    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        hoTen = this.hoTen;
        ngaySinh = this.ngaySinh;
        diaChi = this.diaChi;
        gioiTinh = this.gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
    }
    @Override
    public String toString() {
        System.out.println("====================");
        return "Person: " + "\n\t Họ tên: " +this.getHoTen()+
                "\n\t Ngày sinh: " +this.getNgaySinh()+
                "\n\t Địa chỉ: " +this.getDiaChi()+
                "\n\t Giới tính: " +this.getGioiTinh();

    }
}
