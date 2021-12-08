/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiNCB1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class SoPhuc {
    public double phanThuc;
    public double phanAo; 
    public SoPhuc() {
        
    }
    public SoPhuc(double phanThuc, double phanAo) {
        phanThuc = this.phanThuc;
        phanAo = this.phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    public void nhapSoPhuc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================");
        System.out.println("Nhập phần thực: ");
        phanThuc = sc.nextDouble();
        System.out.println("Nhập phần ảo: ");
        phanAo = sc.nextDouble();
    }
    public void inSoPhuc() {
        System.out.println(this.getPhanThuc() + " + " +this.phanAo+ "i");
    }
    public SoPhuc congSoPhuc(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc congSP = new SoPhuc(0,0);
        congSP.phanThuc = sp1.phanThuc + sp2.phanThuc;
        congSP.phanAo = sp1.phanAo + sp2.phanAo;
        return congSP;
    }
    public SoPhuc nhanSoPhuc(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc nhanSP = new SoPhuc(0,0);
        nhanSP.phanThuc = sp1.phanThuc * sp2.phanThuc - sp1.phanAo * sp2.phanAo;
        nhanSP.phanAo = sp1.phanAo * sp2.phanThuc + sp1.phanThuc * sp2.phanAo;
        return nhanSP;
    }
}
