/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH_mau;

/**
 *
 * @author Administrator
 */
//Viết chương trình nhập vào 2 số nguyên từ bàn phím. In ra tổng, hiệu của 2 số đó.
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b =0;
        System.out.println("Nhập a - ");
        a = sc.nextInt();
        System.out.println("Nhập b - ");
        b = sc.nextInt();
        System.out.println(a+ " + " +b+ " = " +(a+b));
        System.out.println(a+ " - " +b+ " = " +(a-b));
    }
}
