/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author Administrator
 */
public class Manager extends Employee {
    public float luongTrachNhiem;
    public Manager() {
        
    }
    public Manager(float luongTrachNhiem){
        this.luongTrachNhiem = luongTrachNhiem;
    }
    public Manager(float tienLuong, float heSoLuong, float luongTrachNhiem) {
        super(tienLuong, heSoLuong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    public Manager(String ten, int tuoi, String gioiTinh, float tienLuong, float heSoLuong, float luongTrachNhiem) {
        super(ten, tuoi, gioiTinh, tienLuong, heSoLuong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public float getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(float luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    @Override
    public float getTinhLuong() {
        return (float) (super.getTinhLuong() + luongTrachNhiem);
    }
    @Override
    public String toString() {
        System.out.println("=======================");
        return "{Manager:"
                + "Tên: " +super.getTen()+ "\n\tTuổi: " +super.getTuoi()+ "\n\tGiới tính: " +super.getGioiTinh()+ "\n\tLương cơ bản: " +this.getTienLuong()+ "\n\tHệ số luong: " +this.getHeSoLuong()+ "\n\tLương trách nhiệm: " +this.getLuongTrachNhiem() + "\n\tTiền lương: " +this.getTinhLuong() + "}";
    }
}
