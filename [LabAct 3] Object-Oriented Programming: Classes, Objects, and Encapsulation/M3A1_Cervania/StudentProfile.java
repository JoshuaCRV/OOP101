/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class StudentProfile {

    //private
    private String studentId;
    private String studentName;
    private double quizScore;

    //Private static variable
    private static int studentCount = 0;

    //Constructor
    public StudentProfile(String studentId, String studentName, double quizScore) {
        this.studentId = studentId;
        this.studentName = studentName;

        //score validation
        if (quizScore >= 0 && quizScore <= 100) {
            this.quizScore = quizScore;
        } else {
            System.out.println("Invalid initial score! Defaulting to 0.0.");
            this.quizScore = 0.0;
        }

       //increment
        studentCount++;
    }

    //getters
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getQuizScore() {
        return quizScore;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    //setter for quiz score (only accepts 0 to 100)
    public void setQuizScore(double quizScore) {
        if (quizScore >= 0 && quizScore <= 100) {
            this.quizScore = quizScore;
            System.out.println("Score updated successfully for " + studentName + ".");
        } else {
            System.out.println("Error: Invalid score (" + quizScore + "). Value rejected; keeping previous score.");
        }
    }

    //method to display profile
    public void displayProfile() {
        System.out.println("ID: " + studentId + " | Name: " + studentName + " | Quiz Score: " + quizScore);
    }
}
