/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
import java.util.Scanner;

public class ThreeScoreCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();

        int[] scores = new int[3];

        // Read and validate each score 
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + " (0-100): ");
            int inputScore = scanner.nextInt();

            if (inputScore >= 0 && inputScore <= 100) {
                scores[i] = inputScore;
            } else {
                System.out.println("Invalid score! Defaulting score to 0.");
                scores[i] = 0;
            }
        }

        final double PASSING_SCORE = 75.0;
        int total = scores[0] + scores[1] + scores[2];
        double average = (double) total / scores.length;
        boolean passed = average >= PASSING_SCORE;

        System.out.println("\n=== QUIZ SCORE SUMMARY ===");
        System.out.printf("Student Name : %s%n", name);
        System.out.printf("Total Score  : %d%n", total);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Passed Status: %b%n", passed);

        scanner.close();
    }
}