/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Administrator
 */
public class Cylinder extends Cricle {
    public double height;
    public Cylinder() {
        
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    @Override
    public String toString() {
        return "{Cyclinder: radius: " +super.getRadius()+ ",Height: " +this.getHeight()+ ", Color: " + super.getColor() +
                ", Volume: " + this.getVolume() + "}";
    }
}
