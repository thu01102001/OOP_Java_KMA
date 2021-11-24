/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author Administrator
 */
public class Student extends Person{
    public String MaSV;
    public Student() {
        
    }
    public Student(String MaSV) {
        this.MaSV = MaSV;
    }
    public Student(String ten, int tuoi, String gioiTinh, String MaSV) {
        super(ten, tuoi, gioiTinh);
        this.MaSV = MaSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }
    @Override
    public String toString() {
        System.out.println("=======================");
        return "{Student:"
                + "Tên: " +super.getTen()+ "\n\tTuổi: " +super.getTuoi()+ "\n\tGiới tính: " +super.getGioiTinh()+ "\n\tMã sinh viên: " +this.MaSV+ "}";
    }
}
