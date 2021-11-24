/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author Administrator
 */
public class Person {
    public String hoTen;
    public int namSinh;
    public int maThe;
    public Person() {
        
    }
    public Person(String hoTen, int namSinh, int maThe) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.maThe = maThe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int getMaThe() {
        return maThe;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setMaThe(int maThe) {
        this.maThe = maThe;
    }
    @Override
    public String toString() {
        System.out.println("==================");
        return "{Person: " +
                "\n\tHọ tên: " +this.getHoTen()+ "\n\tNăm sinh: " +this.getNamSinh()+ "\n\tMã thẻ: " +this.getMaThe() +"}";
    }
}
