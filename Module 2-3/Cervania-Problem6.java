import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
   
       // INPUT    
        System.out.println("=========================");
        System.out.println("   MOVIE INFORMATION");
        System.out.println("by Uriel Joshua Cervania");
        System.out.println("=========================");

        System.out.print("Enter Movie Title: ");
        String movieTitle = scanner.nextLine();
        
        System.out.print("Enter Director: ");
        String director = scanner.nextLine();
        
        System.out.print("Enter Release Year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter Runtime (in minutes): ");
        int runtime = scanner.nextInt();
        
        System.out.print("Enter rating: ");
        double rating = scanner.nextDouble();
        
       // OUTPUT
        System.out.println("================================");
        System.out.println("DISPLAYING MOVIE INFORMATION...");
        System.out.println("================================");
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Director Name: " + director);
        System.out.println("Release Year: " + year);
        System.out.println("Runtime (in minutes): " + runtime);
        System.out.println("Rating: " + rating);
        
        scanner.close();
    }
}
