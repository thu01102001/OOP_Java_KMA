/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        HocSinh hocsinh = new HocSinh("Thu","AT16",3,4,6);
        HocSinhChuyenToan hschuyentoan = new HocSinhChuyenToan("Thu1", "AT17",9,10,9);
    
        System.out.println(hocsinh.toString());
        System.out.println(hschuyentoan.toString());

    }
}
