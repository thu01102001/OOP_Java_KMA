/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6_3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập n = ");
        int sum = 0;
        n = sc.nextInt();
        if(n % 2 != 0) {
            for(int i = 0 ; i < n; i++) {
                if(i % 2 != 0) {
                    sum += i;
                }
            }
        }
        else {
            for(int k = 0 ; k < n; k++) {
                if(k % 2 == 0) {
                    sum += k;
                }
            }
        }
        System.out.println("Tổng = " +sum);
    }
}
