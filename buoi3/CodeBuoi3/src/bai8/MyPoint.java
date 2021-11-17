/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MyPoint {
    public int x;
    public int y;
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của x = ");
        x = sc.nextInt();
        System.out.println("Nhập giá trị của y = ");
        y = sc.nextInt();
    }
    @Override
    public String toString() {
        return "(" +x+ ", " +y+ ")";
    }
    
    public float distance(int x, int y) {
        float x1 = (float) Math.pow(this.x - x, 2);
        float y1 = (float) Math.pow(this.y - y, 2);
        return (float) Math.sqrt(x1 + y1);
    }

}
