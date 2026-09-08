import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.println("=========================");
        System.out.println("   ONLINE GAME PLAYER");
        System.out.println("by Uriel Joshua Cervania");
        System.out.println("=========================");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Character Name: ");
        String characterName = scanner.nextLine();

        System.out.print("Enter Level: ");
        int level = scanner.nextInt();

        System.out.print("Enter Experience Points: ");
        long experiencePoints = scanner.nextLong();

       
        scanner.nextLine();

        System.out.print("Enter Rank: ");
        String rank = scanner.nextLine();

        // OUTPUT
        System.out.println("===================================");
        System.out.println(" DISPLAYING PLAYER PROFILE...");
        System.out.println("===================================");
        System.out.println("Username: " + username);
        System.out.println("Character Name: " + characterName);
        System.out.println("Level: " + level);
        System.out.println("Experience Points: " + experiencePoints);
        System.out.println("Rank: " + rank);

        scanner.close();
    }
}
