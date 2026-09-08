import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.println("==============================");
        System.out.println(" ACADEMIC ELIGIBILITY CHECKER");
        System.out.println("  by Uriel Joshua Cervania");
        System.out.println("==============================");

        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();

        System.out.print("Enter Attendance Percentage: ");
        double attendance = scanner.nextDouble();

        boolean isEligible = (grade >= 85) && (attendance >= 80);

        // OUTPUT
        System.out.println("===================================");
        System.out.println(" DISPLAYING ELIGIBILITY RESULT...");
        System.out.println("===================================");
        System.out.println("Eligible: " + isEligible);

        scanner.close();
    }
}