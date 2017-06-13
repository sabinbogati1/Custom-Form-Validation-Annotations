/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabin.SpringValidation1.Model;

import com.sabin.SpringValidation1.Validator.IsValidHobby;
import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 *
 * @author Sabin Bogati
 */
public class Student {
    
    @Pattern(regexp = "[^0-9]*")
      private String studentName;
    
    
    @Size(min = 2 , max = 10)
    //@IsValidHobby(listofValidHobbies="Music|Football|Cricket|Hockey")
    @IsValidHobby
    private String studentHobby;
    
    @Max(222)
    private Long studentMobile;
    
    
    
    @Past
    private Date studentDOB;
    
    private ArrayList<String> studentSkills;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    public Long getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(Long studentMobile) {
        this.studentMobile = studentMobile;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public ArrayList<String> getStudentSkills() {
        return studentSkills;
    }

    public void setStudentSkills(ArrayList<String> studentSkills) {
        this.studentSkills = studentSkills;
    }
    
    
    
    
    
    
    
}
