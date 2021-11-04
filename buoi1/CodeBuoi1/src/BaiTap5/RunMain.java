/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap5;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    //B5: Nhap vào 1 so . Neu so dó < 10 thì yêu cau nhap lai cho den khi nào > 10 thì dung
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        
        while(number < 10) {
            System.out.println("Nhập vào 1 số: ");
            number = sc.nextInt();
        }
        System.out.println("Số đó là: " +number);
    }
}
