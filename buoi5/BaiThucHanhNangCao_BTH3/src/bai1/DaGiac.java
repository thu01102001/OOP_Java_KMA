/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class DaGiac {
    public int soCanh;
    public float mang[];
    public DaGiac() {
        
    }
    public DaGiac(int soCanh, float mang[]) {
        soCanh = this.soCanh;
        mang = this.mang;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public float[] getMang() {
        return mang;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public void setMang(float[] mang) {
        this.mang = mang;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cạnh của đa giác: ");
        soCanh = sc.nextInt();
        for(int i = 0; i < soCanh; i++) {
            System.out.println("Nhập cạnh thứ " +(i+1)+ ": ");
       
        }
    }
}
