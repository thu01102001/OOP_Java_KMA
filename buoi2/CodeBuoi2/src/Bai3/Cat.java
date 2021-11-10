/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Administrator
 */
public class Cat {
    String name;
    String country;
    int age;
    //action1 - method 1 : set 
    public void  setName(String nameCat) {
        this.name = nameCat;
    }
    public void setCountry(String countryCat) {
        this.country = countryCat;
    }
    public void setAge(int ageCat) {
        this.age = ageCat;
    }
//method2: get
    public String getName() {
        return this.name;
    }
    public String getCountry() {
        return this.country;
    }
    public int getage() {
        return this.age;
    }
    
    //method3: show information
    public void showInformation() {
        System.out.println("Information of first Cat: ");
        System.out.println("Name: "+this.getName());   
        System.out.println("Country: "+this.country);
        System.out.println("Age: "+this.age);
    }
}

