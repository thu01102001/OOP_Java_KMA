/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author Administrator
 */
public class GiamDoc extends Person{
    public float tienTieuHangThang;
    public GiamDoc() {
        
    }
    public GiamDoc(String hoTen, int namSinh, int maThe, float tienTieuHangThang) {
        super(hoTen, namSinh, maThe);
        this.tienTieuHangThang = tienTieuHangThang;
    }

    public float getTienTieuHangThang() {
        return tienTieuHangThang;
    }

    public void setTienTieuHangThang(float tienTieuHangThang) {
        this.tienTieuHangThang = tienTieuHangThang;
    }
    @Override
    public String toString() {
        System.out.println("==================");
        return "{Giám đốc: " +
                "\n\tHọ tên: " +super.getHoTen()+ "\n\tNăm sinh: " +super.getNamSinh()+ "\n\tMã thẻ: " +super.getMaThe() + "\n\tTiền tiêu hàng tháng: "+this.getTienTieuHangThang()+ "}";
    }
}
