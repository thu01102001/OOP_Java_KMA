/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHNC_B1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class TamGiac extends DaGiac{
    public TamGiac() {
    }

    public TamGiac(int soCanh, int[] kichThuoc) {
        super(soCanh, kichThuoc);
    }

    @Override
    public void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        TamGiac tamGiac = new TamGiac();

        this.setSoCanh(3);

        int[] listKichThuoc = new int[soCanh];
        for(int i = 0; i < this.soCanh; i++){
            System.out.println("Nhap canh thu[" + (i + 1) + "] cua tam giac:");
            int kichThuoc = scanner.nextInt();
            scanner.nextLine();

            listKichThuoc[i] = kichThuoc;
        }
        this.setKichThuoc(listKichThuoc);
    }

    public double dienTich(){
        float p = super.chuVi() / 2;
        float dienTich = p * (p - this.getKichThuoc()[0]) * (p - this.getKichThuoc()[1]) * (p - this.getKichThuoc()[2]);
        return Math.sqrt(dienTich);
    }
}