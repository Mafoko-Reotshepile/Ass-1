/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Student 
{
// Private Variables    
    private String name;
    private int id;
    private int age;
    private String email;
    private String course;

// Constructor
public Student(String name, int id, int age , String email , String course) 
{
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        this.course = course;
}

 // Getters for the student information
    public String getName() 
    {
        return name;
    }

    public int getId() 
    {
        return id;
    }

    public int getAge() 
    {
        return age;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getCourse()
    {
        return course;
    }
    
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age + ", Email:" + email +", Course" + course;
    }
    

}

