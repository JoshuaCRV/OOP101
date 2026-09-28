/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class StudentProfileDemo {

    public static void main(String[] args) {
        //two StudentProfile objects
        StudentProfile student1 = new StudentProfile("S101", "Sam Smith", 85.5);
        StudentProfile student2 = new StudentProfile("S102", "Santa Calle", 92.0);

        System.out.println("--- Initial Student Profiles ---");
        student1.displayProfile();
        student2.displayProfile();

        System.out.println("\n--- Performing Score Updates ---");
        // Valid score update
        System.out.println("Updating Sam's score to 95.0 (Valid):");
        student1.setQuizScore(95.0);

        // Invalid score update
        System.out.println("Updating Santa's score to 120.0 (Invalid):");
        student2.setQuizScore(120.0);

        System.out.println("\n--- Updated Student Profiles ---");
        student1.displayProfile();
        student2.displayProfile();

        System.out.println("\n--- Total Registered Students ---");
        System.out.println("Total Object Count: " + StudentProfile.getStudentCount());
    }
}
