/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Officer Thu = new Officer();
        Thu.setName("Lệ Thu");
        Thu.setCountry("Nam Định");
        Thu.setGender("Nữ");
        Thu.setYearOfBirth(2001);
        Thu.setAddress("Vụ Bản");
        //show
        Thu.showInformation();
    }
}
