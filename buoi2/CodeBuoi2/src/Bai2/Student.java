
package Bai2;

public class Student {
    
    public int birthYear;
    public String codeStudent;
    public String name;
    
    //constructor to set default value for properties
    public Student(){
        this.name = "KMA-X";
        this.codeStudent = "KMA-00x";
        this.birthYear = 2001;
    }
    
    public Student(String StudentName, String code) {
        this.name = StudentName;
        this.codeStudent = code;
        this.birthYear = 2001;
    }
    
    public Student(String StudentName, String code, int year) {
        this.name = StudentName;
        this.codeStudent = code;
        this.birthYear = year;
    }
    
    
    //Method
    //action1 - method 1 : set 
    public void  setName(String nameStudent) {
        this.name = nameStudent;
    }
    public void setCode(String code) {
        this.codeStudent = code;
    }
    public void setBirthday(int birthday) {
        this.birthYear = birthday;
    }
    
    //method2: get
    public String getName() {
        return this.name;
    }
    public String getCode() {
        return this.codeStudent;
    }
    public int getBirthday() {
        return this.birthYear;
    }
    
    //method3: show information
    public void showInformation() {
        System.out.println("=================================");
        System.out.println("Name: "+this.getName());   
        System.out.println("Code: "+this.codeStudent);
        System.out.println("Birth Year: "+this.birthYear);
    }
    
    public void showInformation(String className) {
        System.out.println("=================================");
        System.out.println("You are student in class: "+className);   
        System.out.println("Name: "+this.getName());   
        System.out.println("Code: "+this.codeStudent);
        System.out.println("Birth Year: "+this.birthYear);
    }
}


