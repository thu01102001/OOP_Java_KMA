/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHNC_B1;

/**
 *
 * @author Administrator
 */
import java.util.List;
import java.util.Scanner;

public class DaGiac {
    public int soCanh;
    public int[] kichThuoc;

    public DaGiac() {
    }

    public DaGiac(int soCanh, int[] kichThuoc) {
        this.soCanh = soCanh;
        this.kichThuoc = kichThuoc;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int[] kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public void nhapTT(){
        DaGiac daGiac = new DaGiac();
        Scanner scanner = new Scanner(System.in);

        System.out.println("So canh: ");
        int soCanh = scanner.nextInt();
        scanner.nextLine();
        this.setSoCanh(soCanh);

        int[] kichThuocCanh = new int[soCanh];
        for(int i = 0; i < soCanh; i++){
            System.out.println("Nhap kich thuoc canh thu: " + (i + 1));
            int kichThuoc = scanner.nextInt();
            scanner.nextLine();
            kichThuocCanh[i] = kichThuoc;
        }
        this.setKichThuoc(kichThuocCanh);
    }

    public int chuVi(){
        int sum = 0;
        for(int i=  0; i < this.getSoCanh(); i++){
            sum = sum + this.getKichThuoc()[i];
        }
        return sum;
    }
}