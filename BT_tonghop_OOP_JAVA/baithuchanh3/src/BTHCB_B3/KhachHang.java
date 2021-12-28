/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHCB_B3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class KhachHang {
    public String hoTenChuHo;
    public int soNha;
    public int maSo;
    public KhachHang() {
        
    }
    public KhachHang(String hoTenChuHo, int soNha, int maSo) {
        hoTenChuHo = this.hoTenChuHo;
        soNha = this.soNha;
        maSo = this.maSo;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập họ tên chủ hộ: ");
            hoTenChuHo = sc.nextLine();
            System.out.println("Nhập số nhà: ");
            soNha = sc.nextInt();
            System.out.println("Nhập mã số công tư: ");
            maSo = sc.nextInt();
    }
}
