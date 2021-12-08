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
public class BienLai extends KhachHang{
    public int chiSoCu;
    public int chiSoMoi;
    public BienLai() {
        
    }
    public BienLai(String hoTenChuHo, int soNha, int maSoCongTo, int chiSoCu, int chiSoMoi) {
        super(hoTenChuHo, soNha, maSoCongTo);
        chiSoCu = this.chiSoCu;
        chiSoMoi = this.chiSoMoi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }


    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập chỉ số cũ: ");
        chiSoCu = sc.nextInt();
        System.out.println("Nhập chỉ số mới: ");
        chiSoMoi = sc.nextInt();
    }
    public float getSoTienPhaiTra() {
        return (chiSoMoi - chiSoCu) * 850000;
    }
    @Override
    public String toString() {
        System.out.println("============================");
        return "Thông tin: " +
                "\n Họ tên chủ hộ: " +super.getHoTenChuHo()+
                "\n Số nhà: " +super.getSoNha()+
                "\n Mã số công tơ: " +super.getMaSoCongTo()+
                "\n Chỉ số cũ: " +this.getChiSoCu()+
                "\n Chỉ số mới: " +this.getChiSoMoi()+
                "\n Số tiền phải trả: " +this.getSoTienPhaiTra();
    }
}
