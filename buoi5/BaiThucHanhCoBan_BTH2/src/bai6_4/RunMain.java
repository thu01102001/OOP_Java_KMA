/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6_4;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        int n;
        int k;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n = ");
        n = sc.nextInt();
        for(int i = 1; i <= n ; i++) {
            sum = sum + (float)i/(i+1);
        }
        System.out.println("Tổng = " +sum);
    }
}
