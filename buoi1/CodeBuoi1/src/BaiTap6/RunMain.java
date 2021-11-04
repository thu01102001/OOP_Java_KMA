/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap6;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        //B6: Tao ra chuong trình máy tính (calculator) (yêu cau nhap vào numberFirst, numberSecond, operator(phép toán) --> su dung switch case)
        int numberFirst = 0;
        int numberSecond = 0;
        float result = 0;
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ 1: ");
        numberFirst = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào số thứ 2: ");
        numberSecond = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào phép toán: ");
        operator = sc.nextLine();
        sc.close();
        switch(operator) {
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "*":
            case "x":
                result = numberFirst * numberSecond;
                break;
            case "/":
            case ":":
                result = (float) numberFirst / numberSecond;
                break;
            case "%":
                result = numberFirst % numberSecond;
                break;
            default:
                System.out.println("Vui lngf nhập lại phép toán");
                break;
        }
        System.out.printf("%d %s %d = %f\n", numberFirst, operator, numberSecond, result);
    }
}
