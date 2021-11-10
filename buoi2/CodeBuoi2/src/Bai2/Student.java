
package Bai2;

public class Student {
    
    public int birthYear;
    public String codeStudent;
    public String name;
    
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
        System.out.println("Information of first Student: ");
        System.out.println("Name: "+this.getName());   
        System.out.println("Code: "+this.codeStudent);
        System.out.println("Birth Year: "+this.birthYear);
    }
}

// create a cat class; Create new object of class doremon

