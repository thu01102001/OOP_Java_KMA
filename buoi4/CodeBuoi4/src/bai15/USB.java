/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai15;

/**
 *
 * @author Administrator
 */
public class USB {
    public int maHang;
    public float gia;
    public int soLuong;
    public USB() {
        
    }
    public USB(int maHang,float gia, int soLuong) {
        this.maHang = maHang;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getMaHang() {
        return maHang;
    }

    public float getGia() {
        return gia;
    }
    
    public int getSoLuong() {
        return soLuong;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
    public void setGia(float gia) {
        this.gia = gia;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float tongTien() {
        return gia * soLuong;
    }
    public void showInformation() {
        System.out.println("ĐƠN HÀNG");
        System.out.println("Mã hàng: " + this.getMaHang());
        System.out.println("Giá: " + this.getGia());
        System.out.println("Số lượng: " + this.getSoLuong());
        System.out.println("Tổng tiền: " + this.tongTien());
        System.out.println("-----------------------------------");
    }
}
