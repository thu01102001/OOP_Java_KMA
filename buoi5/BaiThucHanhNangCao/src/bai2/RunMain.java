/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        float a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = sc.nextFloat();
        System.out.println("Nhập b = ");
        b = sc.nextDouble();
        System.out.println(a+ " + " +b+ " = " +(float)(a+b));
        System.out.println(a+ " - " +b+ " = " +(float)(a-b));
        System.out.println(a+ " * " +b+ " = " +(float)(a*b));
        System.out.println(a+ " / " +b+ " = " +(float)(a/b));
        System.out.println(a+ " % " +b+ " = " +(float)(a%b));
    }
}
