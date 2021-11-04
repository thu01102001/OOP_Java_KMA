/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap7;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        /*
        B7: Nhap vào 1 so tu 1 - 80. kiem tra neu so dó < so Random(yêu cau so Random kieu int và trong khoang tu 1-80) --> in ra "so ban dã nhap nho hon so Random"
        neu so dó > so Random(yêu cau so Random kieu int và trong khoang tu 1-80) --> in ra "so ban dã nhap lon hon so Random"
        neu so dó = so Random --> in ra "Thành công"
        --> in ra tong so lan thu
        */
        int number = 0;
        int times = 0;
        final int MAX_NUMBER = 80;
        final int MIN_NUMBER = 1;
        int range = (MAX_NUMBER - MIN_NUMBER) + 1;
        int soRandom = (int)(Math.random() * range) + MIN_NUMBER;
        Scanner sc = new Scanner(System.in);
        while(soRandom != number) {
                System.out.println("Nhập số trong khoảng từ 1 đến 80 là: ");
                number = sc.nextInt();
                sc.hasNextLine();
                if(number > soRandom) {
                        System.out.println("Số bạn nhập lớn hơn số random");
                }
                else if (number < soRandom) {
                        System.out.println("Số bạn nhập nhỏ hơn số random");
                }
                else {
                        System.out.println("Thành công !");
                }
                times++;
        }
        sc.close();
        System.out.printf("Bạn đã thử: %d lần", times);

    }
}
