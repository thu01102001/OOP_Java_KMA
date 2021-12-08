/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class KhachHang {
    public String hoTenChuHo;
    public int soNha;
    public int maSoCongTo;
    public KhachHang() {
        
    }
    public KhachHang(String hoTenChuHo, int soNha, int maSoCongTo) {
        hoTenChuHo = this.hoTenChuHo;
        soNha = this.soNha;
        maSoCongTo = this.maSoCongTo;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public int getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public void setMaSoCongTo(int maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên chủ hộ: ");
        hoTenChuHo = sc.nextLine();
        System.out.println("Nhập số nhà: ");
        soNha = sc.nextInt();
        System.out.println("Nhập mã số công tơ: ");
        maSoCongTo = sc.nextInt();
    }
}
