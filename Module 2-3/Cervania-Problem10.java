
import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.println("=========================");
        System.out.println(" EMPLOYEE PAYROLL RECORD");
        System.out.println("by Uriel Joshua Cervania");
        System.out.println("=========================");

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter Position: ");
        String position = scanner.nextLine();

        System.out.print("Enter Hours Worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();

        // OUTPUT
        System.out.println("===================================");
        System.out.println(" DISPLAYING PAYROLL INFORMATION...");
        System.out.println("===================================");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Position: " + position);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);

        scanner.close();
    }
}
