/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHNC_B1;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        DaGiac daGiac = new DaGiac();
        daGiac.nhapTT();
        System.out.println("Chu vi: " + daGiac.chuVi());

        TamGiac tamGiac = new TamGiac();
        tamGiac.nhapTT();
        System.out.println("Chu vi: " +tamGiac.chuVi());
        System.out.println("Dien tich: " + tamGiac.dienTich() );
    }
}
