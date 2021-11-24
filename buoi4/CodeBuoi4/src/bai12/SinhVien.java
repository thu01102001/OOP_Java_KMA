/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author Administrator
 */
public class SinhVien extends Person{
    public float tienHocPhi;
    public SinhVien() {
     
    }
    public SinhVien(String hoTen, int namSinh, int maThe, float tienHocPhi) {
        super(hoTen, namSinh, maThe);
        this.tienHocPhi = tienHocPhi;
    }

    public float getTienHocPhi() {
        return tienHocPhi;
    }

    public void setTienHocPhi(float tienHocPhi) {
        this.tienHocPhi = tienHocPhi;
    }
    @Override
    public String toString() {
        System.out.println("==================");
        return "{Sinh viên: " +
                "\n\tHọ tên: " +super.getHoTen()+ "\n\tNăm sinh: " +super.getNamSinh()+ "\n\tMã thẻ: " +super.getMaThe() + "\n\tTiền học phí còn nợ: "+this.getTienHocPhi()+ "}";
    }
}
