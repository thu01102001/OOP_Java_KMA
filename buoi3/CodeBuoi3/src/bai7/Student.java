/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student {
    public String maSV;
    public float diem;
    public int tuoi;
    public String lop;
    
    public Student() {
        
    }
    public Student(String maSV, float diem, int tuoi, String lop) {
        this.maSV = maSV;
        this.diem = diem;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public float getDiem() {
        return diem;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên: ");
        do {
            System.out.println("Mã sinh viên: ");
            maSV = sc.nextLine();
            if(maSV.length() < 8) {
                System.out.println("Mã sinh viên phải lớn hơn 8");
            }
        }while(maSV.length() < 8);
        
        System.out.println("Nhập điểm: ");
        do {
            diem = sc.nextFloat();
            sc.nextLine();
            if(diem < 0 || diem > 10) {
                System.out.println("Nhap lai diem");
            }
        }while(diem < 0 || diem >10);
        
        System.out.println("Nhập tuổi: ");
        do{
            tuoi = sc.nextInt();
            sc.nextLine();
            if(tuoi < 18){
                System.out.println("Nhập lại tuổi: ");
            }
        }while (tuoi < 18);

        char a = 'A';
        char c = 'C';
        System.out.println("Nhap lop: ");
        do{
            lop = sc.nextLine();
            if(!lop.startsWith("A") && !lop.startsWith("C")){
                System.out.println("Nhap lai lop");
            }
        }while (!lop.startsWith("A") && !lop.startsWith("C"));       
    }
    
    public void showInfo(){
        System.out.println("=========================");
        System.out.println("Sinh viên: ");
        System.out.println("Mã SV: " +this.maSV);
        System.out.println("Điểm: " +this.diem);
        System.out.println("Tuổi: " +this.tuoi);
        System.out.println("Lớp: " +this.lop);
    }

    public void hocBong(float diem){
        if (diem > 8){
            System.out.println("Đạt học bổng");
        }else {
            System.out.println("Không đạt học bổng");
        }
    }
    
    
    
}
