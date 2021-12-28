/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHNC_B2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        double b;
        System.out.println("Nhập a = ");
        a = sc.nextFloat();
        System.out.println("Nhập b = ");
        b = sc.nextDouble();
        System.out.println(a+ " + " +b+ " = " +(a+b));
        System.out.println(a+ " - " +b+ " = " +(a-b));
        System.out.println(a+ " * " +b+ " = " +(a*b));
        System.out.println(a+ " / " +b+ " = " +(a/b));
        System.out.println(a+ " % " +b+ " = " +(a%b));
    }
}
