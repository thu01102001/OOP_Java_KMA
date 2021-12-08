/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
/*
Viết chương trình:
1.Khai báo (import)  lớp Scanner trong gói java.util
2.Sử dụng phương thức nextLine () của lớp để nhập vào một xâu và in xâu vừa nhập ra màn hình.
*/
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xau;
        System.out.println("Nhập vào 1 xâu: ");
        xau = sc.nextLine();
        System.out.println("Xâu bạn đã nhập là: " +xau);
    }
}
