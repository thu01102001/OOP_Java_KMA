/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        //Nhập chiều dài, chiều rộng HCN. Tính chu vi, diện tích
        int chieuDai = 0;
        int chieuRong = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài: ");
        chieuDai = sc.nextInt();
        System.out.println("Nhập vào chiều rộng: ");
        chieuRong = sc.nextInt();
        sc.close();
        int dienTich = chieuDai * chieuRong;
        float chuVi = (float)(chieuDai + chieuRong) / 2;
        System.out.println("Diện tích của hình chữ nhật là: " +dienTich);        
        System.out.println("Chu vi của hình chữ nhật là: " +chuVi);
    }
}
