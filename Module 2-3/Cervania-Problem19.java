import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.println("============================");
        System.out.println("BITWISE AND SHIFT OPERATIONS");
        System.out.println(" by Uriel Joshua Cervania");
        System.out.println("============================");

        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseNotA = ~a;
        int leftShiftA = a << 1;
        int rightShiftA = a >> 1;

        // OUTPUT
        System.out.println("===================================");
        System.out.println(" DISPLAYING BITWISE RESULTS...");
        System.out.println("===================================");
        System.out.println("AND=" + bitwiseAnd + "; OR=" + bitwiseOr + "; XOR=" + bitwiseXor + 
                           "; NOT a=" + bitwiseNotA + "; a<<1=" + leftShiftA + "; a>>1=" + rightShiftA);

        scanner.close();
    }
}
