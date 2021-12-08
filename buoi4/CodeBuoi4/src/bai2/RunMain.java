/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        Diem d1 = new Diem(3,7);
        Diem d2 = new Diem(9,3);
        d1.inTTDiem();
        d2.inTTDiem();
        System.out.println("Khoảng cách của 2 điểm: " + d1.tinhKhoangCach(d2));
    }
}
