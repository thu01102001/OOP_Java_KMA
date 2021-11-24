/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Administrator
 */
public class Cricle {
    public double radius;
    public String color;
    public Cricle(){
        
    }
    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "{" +radius+ "," +color+ "}";
    }
    
}
