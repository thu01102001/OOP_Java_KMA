/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;


/**
 *
 * @author Administrator
 */
public class Cricle {
    public double Radius;
    public String Color;

    //constructor 1
    public Cricle() {
        this.Radius = 1.0;
        this.Color = "red";
    }
    
    //constructor 2
    public Cricle(double radius) {
        this.Radius = radius;
        this.Color = "red";
    }
    
    //constructor 3
    public Cricle(double radius, String color) {
        this.Radius = radius;
        this.Color = color;
    }
    
    public double getRadius() {
        return Radius;
    }

    public String getColor() {
        return Color;
    }

    public void setRadius(float Radius) {
        this.Radius = Radius;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    public void showCircle() {
            System.out.println("==========================");       
            System.out.println("Radius: " +this.Radius);
            System.out.println("Radius: " +this.Color);

    }
}
