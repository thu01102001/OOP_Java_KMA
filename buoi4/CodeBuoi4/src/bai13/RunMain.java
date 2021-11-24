/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        TenNguoiViet nguoiviet = new TenNguoiViet("Nguyễn ", "Thu");
        TenNguoiNuocNgoai nguoinuocngoai = new TenNguoiNuocNgoai("Nguyễn ", "Thu ");
        
        System.out.println(nguoiviet.toString());
        System.out.println(nguoinuocngoai.toString());

    }
}
