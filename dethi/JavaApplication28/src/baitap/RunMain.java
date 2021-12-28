/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

/**
 *
 * @author Administrator
 */
import static java.lang.System.exit;
import java.util.Scanner;
public class RunMain {
    public static void showMenu() {
        System.out.println("------------MENU------------");
        System.out.println("1. Thêm sách");
        System.out.println("2. Chỉnh sửa thông tin sách");
        System.out.println("3. Xóa sách");
        System.out.println("4. Tìm sách");
        System.out.println("5. Hiển thị sách");
        System.out.println("0. Thoát");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store sach = new Store();
        int chon;
        while(true) {
            showMenu();
            chon = sc.nextInt();
            switch(chon) {
                case 1: 
                    System.out.println("Bạn đã chọn nhập thêm sách: ");
                    sach.add();
                    break;
                case 2:
                
                    System.out.println("Bạn đã chọn sửa thông ti!");
                    System.out.println("Nhập ID sách cần sửa: ");
                    int idSua = sc.nextInt();
                    sach.edit(idSua);
                    break;
                case 3: 
                    System.out.println("Bạn đã chọn xóa thông tin sách:");
                    System.out.println("Nhập ID sách cần xóa: ");
                    int idXoa = sc.nextInt();
                    sach.delete(idXoa);
                    break;
                case 4: 
                    sc.nextLine();
                    System.out.println("Bạn đã chọn tìm sách!");
                    System.out.println("Nhập tên sách cần tìm:");
                    String name = sc.nextLine();
                    sach.find(name);
                    break;
                case 5:
                    System.out.println("Bạn đã chọn hiển thị toàn bộ sách: !");
                    sach.list();
                    break;
                case 0:
                    exit(0);
                    break;
                default: 
                    System.out.println("Vui lòng nhập lại");
                    break;
            }   
        }
    }
}
