/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiNCB1;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc();
        sp1.nhapSoPhuc();
        System.out.println("Số phức thứ 1 là: ");
        sp1.inSoPhuc();
        
        SoPhuc sp2 = new SoPhuc();
        sp2.nhapSoPhuc();
        System.out.println("Số phức thứ 2 là: ");
        sp2.inSoPhuc();
        SoPhuc sp = new SoPhuc();
        //tong
        System.out.println("================");
        SoPhuc Tong = sp.congSoPhuc(sp1,sp2);
        System.out.println("Tong: ");
       System.out.println(Tong.getPhanThuc() + " + " + Tong.getPhanAo() + "i");
       //Nhan
       System.out.println("Nhan: ");
       SoPhuc Nhan = sp.nhanSoPhuc(sp1, sp2);
       System.out.println(Nhan.getPhanThuc() + " + " + Nhan.getPhanAo() + "i");
    }
}
