import java.util.Scanner;

public class Problem8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.println("===========================");
        System.out.println(" COURSE ENROLLMENT RECORD");
        System.out.println("by Uriel Joshua Cervania");
        System.out.println("===========================");

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Subject Code: ");
        String subjectCode = scanner.nextLine();

        System.out.print("Enter Subject Title: ");
        String subjectTitle = scanner.nextLine();

        System.out.print("Enter Units: ");
        int units = scanner.nextInt();

        System.out.print("Enter Section Letter: ");
        char section = scanner.next().charAt(0);

        // OUTPUT
        System.out.println("===================================");
        System.out.println(" DISPLAYING ENROLLMENT RECORD...");
        System.out.println("===================================");
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Title: " + subjectTitle);
        System.out.println("Units: " + units);
        System.out.println("Section: " + section);
        
        scanner.close();
    }
}