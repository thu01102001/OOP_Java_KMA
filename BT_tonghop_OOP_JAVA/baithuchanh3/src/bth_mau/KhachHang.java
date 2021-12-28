/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth_mau;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class KhachHang {
    String name;
    String address;
    int phone;
    String email;
    public KhachHang() {
        
    }
    public KhachHang(String name, String address, int phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void Nhap() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter phone: ");
        phone = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter email: ");
        email = sc.nextLine();
        sc.close();
    }
    public void Xuat() {
        System.out.println("===========================");
        System.out.println("Name: " +this.getName());
        System.out.println("Address: " +this.getAddress());
        System.out.println("Phone: " +this.getPhone());
        System.out.println("Email: " +this.getEmail());
    }
    
}

