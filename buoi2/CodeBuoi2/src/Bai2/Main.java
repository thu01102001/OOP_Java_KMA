/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author Administrator
 */
public class Main {
    //Properties: name,codeStudent, birthYear
    //Phamvitruyxuat Kieudulieu tenthuoctinh
    //Method - actions
    public static void main(String[] args) {
        Student firstStudent = new Student();
//        firstStudent.name = "Thu";
//        firstStudent.codeStudent = "AT160447";
//        firstStudent.birthYear = 2001;
        
        firstStudent.setName("Lệ Thu");
        firstStudent.setCode("AT160447");
        firstStudent.setBirthday(2001);
        //show
        firstStudent.showInformation();
    }
    
}
