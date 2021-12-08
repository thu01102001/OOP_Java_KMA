/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Giá trị tăng dần: ");
        for(int k = 0; k <=10 ; k++) {
            System.out.print("-" +k);
        }
        System.out.println("");
        System.out.println("Giá trị giảm dần: ");
        for(int m = i; m >= 0; m--) {
            System.out.print("-" +m);
        }
        
    }
}
