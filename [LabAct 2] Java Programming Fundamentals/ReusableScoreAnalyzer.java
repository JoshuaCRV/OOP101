/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class ReusableScoreAnalyzer {

    public static void main(String[] args) {
        // Initial test array
        int[] scores = {90, 90, 95};

        double average = calculateAverage(scores);
        String remark = getRemark(average);

        System.out.printf("Average: %.2f%n", average);
        System.out.println("Remark: " + remark);
    }

    static double calculateAverage(int[] scores) {
        int total = 0;

        // Loop through every array item to accumulate total
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    static String getRemark(double average) {
        if (average >= 90.0) {
            return "Excellent";
        } else if (average >= 75.0) {
            return "Passed";
        } else {
            return "Needs Improvement";
        }
    }
}
