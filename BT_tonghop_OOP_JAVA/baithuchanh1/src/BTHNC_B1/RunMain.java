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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số cạnh của đa giác: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Nhập chiều dài cạnh thứ " +(i+1)+ ": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Chu vi đa giác là: " +sum);
    }
}
