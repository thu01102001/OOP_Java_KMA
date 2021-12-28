/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

/**
 *
 * @author Administrator
 */
public class Book {
    public int id;
    public String name;
    public double price;
    public Book() {
        
    }
    public Book(int id, String name, double price) {
        id = this.id;
        name = this.name;
        price = this.price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book {" +
                "\n\t ID: " +this.getId()+
                "\n\t Name: " +this.getName()+
                "\n\t Price: " +this.getPrice();
    }
}
