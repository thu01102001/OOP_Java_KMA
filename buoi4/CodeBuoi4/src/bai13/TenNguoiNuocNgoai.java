/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13;

/**
 *
 * @author Administrator
 */
public class TenNguoiNuocNgoai extends TenNguoiViet{
    public TenNguoiNuocNgoai() {
        
    }
    public TenNguoiNuocNgoai(String ten, String ho) {
        super(ten, ho);
    }
    
    @Override
    public String toString() {
        return "Tên người việt: " +this.getTen()+this.getHo();
    }
}
