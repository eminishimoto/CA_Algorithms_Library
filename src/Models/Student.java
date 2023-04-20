/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Objects;

/**
 *
 * @author emi
 */
public class Student implements Comparable {
    
        // attribute
    private String studentId;
    private String studentFirst;
    private String studentLast;
    private String gender;
    private String country;
//    private String[] borrowinglist;//?

    
    //constructor
    public Student(){}
    public Student(String studentId){}
    
    public Student(String studentId, String studentFirst, String studentLast, String gender,String country) {
        this.studentId = studentId;
        this.studentFirst = studentFirst;
        this.studentLast = studentLast;
        this.gender = gender;
        this.country = country;
//        this.borrowinglist = borrowinglist; //?
    }

    @Override
    public String toString() {
        return "Student {" + "studentId=" + studentId + ", studentFirst=" + studentFirst + ", studentLast=" + studentLast + ", gender=" + gender + ", country=" + country + '}';
    }
    
    

    
    public String showStudentinfo() {
        return "\nStudent info : " + "studentId=" + studentId + ", studentFirst=" + studentFirst + ", studentLast=" + studentLast + ", gender=" + gender + ", country=" + country ;
    }
    
//"\n********* \n Staff ID:\t" + this.staff_ID + "\nFirstname:\t" + this.firstname + "\nSurname:\t" + this.surname + "\nRole:\t" + this.role.toString();
    
    public String getStudentId() {
        return studentId;
    }

    public String getStudentFirst() {
        return studentFirst;
    }

    public String getStudentLast() {
        return studentLast;
    }
    
    public String getStudentFullname() {
        return studentFirst  + " " + studentLast;
    }

public String toStringfirstName(){
    return studentFirst;
    }

//   }
     @Override
    public int compareTo(Object o) {
        return this.studentFirst.compareTo(o.toString());
    }
    
}
