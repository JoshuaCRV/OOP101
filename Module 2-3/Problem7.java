import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
   
       // INPUT    
        System.out.println("=========================");
        System.out.println("  BANK ACCOUNT RECORD");
        System.out.println("by Uriel Joshua Cervania");
        System.out.println("=========================");

        System.out.print("Enter Account Holder: ");
        String accountHolder = scanner.nextLine();
        
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine();
        
        
        System.out.print("Enter Current Balance: ");
        double balance = scanner.nextDouble();
        
       // OUTPUT
        System.out.println("===================================");
        System.out.println(" DISPLAYING BANK ACCOUNT RECORD...");
        System.out.println("===================================");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
       
        scanner.close();
    }
}