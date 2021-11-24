/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        Cricle circle = new Cricle(10, "Red");
        Cylinder cylinder = new Cylinder(10, "Yellow", 10);
        System.out.println("Area Circle: " + circle.getArea());
        System.out.println("Volume Cylinder: " + cylinder.getVolume());

        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
