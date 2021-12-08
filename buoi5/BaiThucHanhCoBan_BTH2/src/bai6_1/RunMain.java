/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6_1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.lang.Math;
public class RunMain {
    public static void main(String[] args) {
        int n; 
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n = ");
        n = sc.nextInt();
        for(int i = 2; i <= n; i++) {
            sum += Math.pow(-1,i)*i;
        }
        System.out.println("Tông = " +sum);
    }

   
}
