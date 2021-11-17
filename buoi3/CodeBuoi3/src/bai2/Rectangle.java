/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class Rectangle {
    public double length;
    public double width;
    
    //constructor 1
    public Rectangle() {
        this.length = 20;
        this.width = 15;
    }
    
    //constructor 2
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
        
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public void showRectangle() {
        System.out.println("=====================");
        System.out.println("Length of Rectangle: " +this.length);
        System.out.println("Width of Rectangle: " +this.width);
    }
}
