/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class Diem {
    public double x, y;
    public Diem() {
        
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public Diem(double x, double y) {
        x = this.x;
        y = this.y;
    }
    public void inTTDiem() {
        System.out.println("X = " +this.getX());
        System.out.println("Y = " +this.getY());
    }
    public double tinhKhoangCach(Diem d) {
        double x1 = d.x;
        double y1 = d.y;
        return Math.sqrt(Math.pow((x1 - this.getX()), 2) + Math.pow((y1 - this.getY()), 2));   
    }
}
