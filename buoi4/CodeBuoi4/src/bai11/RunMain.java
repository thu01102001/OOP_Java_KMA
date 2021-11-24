/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author Administrator
 */
public class RunMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Thu", 20, "Nữ", 1000, 12);
        Manager manager = new Manager("Lệ Thu", 21, "Nam", 1000, 12, 500);
        Student student = new Student("Thu Nguyen", 22, "Nữ", "AT160447");
        Programmer programmer = new Programmer("Nguyễn Thị Lệ Thu", 23, "Nam", "AT16", 7);

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(student.toString());
        System.out.println(programmer.toString());
    }
}
