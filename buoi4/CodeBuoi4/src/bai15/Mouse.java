/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai15;

/**
 *
 * @author Administrator
 */
public class Mouse extends USB{
    public Mouse() {
        
    }
    public Mouse(int maHang, float gia, int soLuong) {
        super(maHang, gia, soLuong);
    }
    @Override
    public float tongTien() {
        return (this.gia * this.soLuong * (float) 0.8);
    }
    
    public void showInfomation(){
        super.showInformation();
    }
    
}
