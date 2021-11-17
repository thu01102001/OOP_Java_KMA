/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        Cricle firstCricle = new Cricle();    
        Cricle secondCricle = new Cricle(2.0);
        Cricle thirstCricle = new Cricle(3.0,"blue");
        
        //show
        firstCricle.showCircle();    
        secondCricle.showCircle();
        thirstCricle.showCircle();
    }

}
