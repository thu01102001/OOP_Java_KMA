/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

/**
 *
 * @author Administrator
 */
public class HocSinhChuyenToan extends HocSinh{
    public HocSinhChuyenToan() {
        
    }
    public HocSinhChuyenToan(String hoTen, String lop, float toan, float ly, float hoa) {
        super(hoTen,lop,toan,ly,hoa);
    }
    public float getDiemTB() {
        return (toan*2 + ly + hoa) / 4;
    }
    @Override
    public String toString() {
        System.out.println("========================");
        return "{Học sinh: Tên: " +super.getHoTen()+ "\n\tLớp: " +super.getLop()+ "\n\tToán: " +super.getToan()+ "\n\tLý" +super.getLy()+ "\n\tHóa: "+super.getHoa()+ "\n\tĐiểm trung bình: " +this.getDiemTB()+ "}";
    }
}
