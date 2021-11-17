/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Employee {
    public String ten;
    public int tuoi;
    public String diaChi;
    public double tienLuong;
    public int gioLam;
    
    //constructor
    public Employee() {
        
    }
    public Employee(String ten, int tuoi, String diaChi, double tienLuong, int gioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.gioLam = gioLam;
    }
    
    //geter 
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getGioLam() {
        return gioLam;
    }
    
    //seter

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }
    
    //void inputInfo
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của nhân viên: ");
        ten = sc.nextLine();
        System.out.print("Nhập tuổi của nhân viên: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ của nhân viên: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập tiền lương của nhân viên: ");
        tienLuong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập tổng số giờ làm của nhân viên: ");
        gioLam = sc.nextInt();
        sc.close();
    }
    
    //void printInfo
    public void printInfo() {
        System.out.println("Tên: " +this.ten);
        System.out.println("Tuổi: " +this.tuoi);
        System.out.println("Địa chỉ: " +this.diaChi);
        System.out.println("Tiền lương: " +this.tienLuong);
        System.out.println("Tổng số giờ làm: " +this.gioLam);
    }
    
    //double tinhThuong
    public double tinhThuong(float thuong) {
        if(gioLam >= 200) {
            thuong = (float) (tienLuong * 0.2);
        }
        else if(gioLam < 200 && gioLam >= 100) {
            thuong = (float) (tienLuong * 0.1);
        }
        else {
            thuong = 0;
        }
        return thuong;
    }
}
