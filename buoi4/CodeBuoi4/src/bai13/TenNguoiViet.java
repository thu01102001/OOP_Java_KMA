/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13;

/**
 *
 * @author Administrator
 */
public class TenNguoiViet {
    public String ho;
    public String ten;
    public TenNguoiViet() {
        
    }
    public TenNguoiViet(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    @Override
    public String toString() {
        return "Tên người việt: " +this.getHo()+this.getTen();
    }
}
