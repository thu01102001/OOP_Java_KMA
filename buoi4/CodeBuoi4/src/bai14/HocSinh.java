/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

/**
 *
 * @author Administrator
 */
public class HocSinh {
    public String hoTen;
    public String lop;
    public float toan;
    public float ly;
    public float hoa;
    public HocSinh() {
        
    }
    public HocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public float getToan() {
        return toan;
    }

    public float getLy() {
        return ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    @Override
    public String toString() {
        System.out.println("========================");
        return "{Học sinh: Tên: " +this.getHoTen()+ "\n\tLớp: " +this.getLop()+ "\n\tToán: " +this.getToan()+ "\n\tLý" +this.getLy()+ "\n\tHóa: "+this.getHoa()+ "}";
    }
}
