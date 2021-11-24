/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author Administrator
 */
public class GiangVien extends Person{
    public float tienLuongHangThang;
    public GiangVien() {
        
    }
    public GiangVien(String hoTen, int namSinh, int maThe, float tienLuongHangThang) {
        super(hoTen, namSinh, maThe);
        this.tienLuongHangThang = tienLuongHangThang;
    }

    public float getTienLuongHangThang() {
        return tienLuongHangThang;
    }

    public void setTienLuongHangThang(float tienLuongHangThang) {
        this.tienLuongHangThang = tienLuongHangThang;
    }
    @Override
    public String toString() {
        System.out.println("==================");
        return "{Giảng viên: " +
                "\n\tHọ tên: " +super.getHoTen()+ "\n\tNăm sinh: " +super.getNamSinh()+ "\n\tMã thẻ: " +super.getMaThe() + "\n\tTiền lương hàng tháng: "+this.getTienLuongHangThang()+ "}";
    }
}
