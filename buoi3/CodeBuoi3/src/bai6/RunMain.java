/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        Employee NV1 = new Employee();
        System.out.println("Nhập thông tin nhân viên: ");
        NV1.inputInfo();
        System.out.println("========================");
        System.out.println("Thông tin: ");
        NV1.printInfo();
        
        System.out.println("Tiền thưởng của NV1 = " +NV1.tinhThuong(0));
    }
}
