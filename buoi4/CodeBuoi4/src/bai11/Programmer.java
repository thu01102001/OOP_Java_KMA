/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author Administrator
 */
public class Programmer extends Student{
    public int soNamKinhNghiem;
    public Programmer() {
        
    }
    public Programmer(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
    public Programmer(String MaSV, int soNamKinhNghiem) {
        super(MaSV);
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
    public Programmer(String ten, int tuoi, String gioiTinh, String MaSV, int soNamKinhNghiem) {
        super(ten, tuoi, gioiTinh, MaSV);
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
    @Override
    public String toString() {
        System.out.println("=======================");
        return "{Programmer:"
                + "Tên: " +super.getTen()+ "\n\tTuổi: " +super.getTuoi()+ "\n\tGiới tính: " +super.getGioiTinh()+ "\n\tMã sinh viên: " +this.getMaSV()+ "\n\tSố năm kinh nghiệm: " +this.getSoNamKinhNghiem()+ "}";
    }
}
