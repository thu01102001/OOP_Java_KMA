/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap4;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        //Nhap vào 1 so . Neu so dó > 10 thì number = number / 10. Nguoc lai thì * 10
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        number = sc.nextInt();
        sc.close();
        if(number > 10) {
            number = number / 10;
        }
        else {
            number = number * 10;
        }
        System.out.println("Số sau khi kiểm tra là: " +number);
    }
}
