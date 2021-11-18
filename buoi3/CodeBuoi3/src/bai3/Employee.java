/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Administrator
 */
public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double salaryMonthly;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalaryMonthly(double salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }
    public void showInformation() {
        System.out.println("ID: " +this.id);
        System.out.println("FirstName: " +this.firstName);
        System.out.println("LastName: " +this.lastName);
        System.out.println("SalaryMonthly: " +this.salaryMonthly);
    }
}
