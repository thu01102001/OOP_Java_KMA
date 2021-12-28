/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTHCB_B1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Nguoi {
    public String name;
    public String address;
    public int birthYear;
    public Nguoi() {
        
    }
    public Nguoi(String name, String address, int birthYear) {
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter birthYear: ");
        birthYear = sc.nextInt();
        sc.close();
    }
    public void inTT() {
        System.out.println("==========================");
        System.out.println("Name: " +this.getName());
        System.out.println("Name: " +this.getAddress());
        System.out.println("Name: " +this.getBirthYear());
    }
}
