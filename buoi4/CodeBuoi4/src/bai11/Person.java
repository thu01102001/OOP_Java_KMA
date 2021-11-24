/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author Administrator
 */
public class Person {
    public String ten;
    public int tuoi;
    public String gioiTinh;
    public Person() {
        
    }
    public Person(String ten, int tuoi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    @Override
    public String toString() {
        System.out.println("=======================");
        return "Person:"
                + "Tên: " +this.getTen()+ "\n\tTuổi: " +this.getTuoi()+ "\n\tGiới tính: " +this.getGioiTinh();
    }
}
