/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author angieluz cervania
 */
public class M3A2_Cervania {
    public static void main(String[] args) {
        // Create one Book object
        Book book = new Book("Java Programming Principles");

        // Create two Member objects
        Member member1 = new Member("Sam Smith");
        Member member2 = new Member("Santa Calle");

        System.out.println("--- Test 1: First Member Borrows Available Book ---");
        member1.borrow(book);
        member1.displayBorrowedBook();

        System.out.println("\n--- Test 2: Second Member Tries to Borrow Same Book ---");
        member2.borrow(book);
        member2.displayBorrowedBook();
    }
}
