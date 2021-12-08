/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        
        SinhVien sv = new SinhVien();
        sv.nhap();
        

        System.out.println(sv.toString());
        sv.getXepHang();
    }
}
