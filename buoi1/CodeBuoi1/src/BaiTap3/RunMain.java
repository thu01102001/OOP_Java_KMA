/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        //Nhập 3 số . Tìm số lớn nhất
        int number1, number2, number3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        number1 = sc.nextInt();
        System.out.println("Nhập số thứ 2: ");
        number2 = sc.nextInt();
        System.out.println("Nhập số thứ 3: ");
        number3 = sc.nextInt();
        int max = number1;
        if(number2 > max) {
            max = number2;
        }
        else {
            max = number3;
        }
        System.out.println("Số lớn nhất là: " +max);
    }
}
