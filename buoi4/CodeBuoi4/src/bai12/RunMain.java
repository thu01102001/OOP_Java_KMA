/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        SinhVien sinhvien = new SinhVien("Thu", 2001, 1, (float) 100.2);
        GiangVien giangvien = new GiangVien("Thu1", 2002, 2, (float) 100.5);
        GiamDoc giamdoc = new GiamDoc("Thu2", 2003, 3, (float) 100.7);

        System.out.println(sinhvien.toString());
        System.out.println(giangvien.toString());
        System.out.println(giamdoc.toString());

    }
}
