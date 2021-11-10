/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author Administrator
 */
public class Officer {
    String name;
    String country;
    String gender;
    int yearOfBirth;
    String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }
    public void showInformation() {
        System.out.println("Information of first Student: ");
        System.out.println("Name: "+this.getName());   
        System.out.println("Country: "+this.country);
        System.out.println("Gender: "+this.gender);
        System.out.println("Address: "+this.address);
        System.out.println("Age: "+(2021 - this.yearOfBirth));
    }
    
}
