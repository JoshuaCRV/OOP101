/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class CorrectedSimpleAverage {
public static void main(String[] args) { int[] scores = {80, 90, 70};
int total = 0;

for (int i = 0; i < scores.length; i++) { total += scores[i];
}

double average = (double) total / scores.length; System.out.println("Average: " + average);
}
}
