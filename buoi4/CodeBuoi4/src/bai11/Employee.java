/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author Administrator
 */
public class Employee extends Person {
    public float tienLuong;
    public float heSoLuong; 
    public Employee() {
        
    }
    public Employee(float tienLuong, float heSoLuong) {
        this.tienLuong = tienLuong;
        this.heSoLuong = heSoLuong;
    }
    public Employee(String ten, int tuoi, String gioiTinh, float tienLuong, float heSoLuong) {
        super(ten, tuoi, gioiTinh);
        this.tienLuong = tienLuong;
        this.heSoLuong = heSoLuong;
    }

    public float getTienLuong() {
        return tienLuong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setTienLuong(float tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public float getTinhLuong() {
        return tienLuong * heSoLuong;
    }
    @Override
    public String toString() {
        System.out.println("=======================");
        return "{Employee:"
                + "Tên: " +super.getTen()+ "\n\tTuổi: " +super.getTuoi()+ "\n\tGiới tính: " +super.getGioiTinh()+ "\n\tLương cơ bản: " +this.getTienLuong()+ "\n\tHệ số luong: " +this.getHeSoLuong()+ "\n\tTiền lương: " +this.getTinhLuong() + "}";
    }
}
