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
    
   // List to store students
    private ArrayList<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    
    // Method to capture a new student
    public void captureStudent() {
            System.out.println("=== Capture Student ===");
        try {
            System.out.print("Enter Student ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Student Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
             System.out.print("Enter Student Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Student Course: ");
            String course = scanner.nextLine();

            // Check if student with same ID already exists
            for (Student s : studentList) {
                if (s.getId() == id) {
                    System.out.println("A student with this ID already exists.");
                    return;
                }
            }

            Student student = new Student(name, id, age,  email, course);
            studentList.add(student);
            System.out.println("Student added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for ID and Age.");
        }
    }
    
    // Method to search for a student by ID
    public void searchStudent() {
        System.out.println("=== Search Student ===");
        try {
            System.out.print("Enter Student ID to search: ");
            int id = Integer.parseInt(scanner.nextLine());

            for (Student s : studentList) {
                if (s.getId() == id) {
                    System.out.println("Student Found: " + s);
                    return;
                }
            }
            System.out.println("Student with ID " + id + " not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric ID.");
        }
    }
    
    

    
}

