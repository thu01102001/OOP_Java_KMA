/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = sc.nextInt();
        System.out.println("Nhập b = ");
        b = sc.nextInt();
        System.out.println("Tổng của " +a+ " + " +b+ " = " +(a+b));
        System.out.println("Hiệu của " +a+ " - " +b+ " = " +(a-b));
    }
}
