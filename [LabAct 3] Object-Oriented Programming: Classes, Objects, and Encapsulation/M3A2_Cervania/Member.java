/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angieluz cervania
 */
public class Member {
    private String name;
    private Book borrowedBook;

    public Member(String name) {
        this.name = name;
        this.borrowedBook = null;
    }
    public String getName() {
        return name;
    }
    public Book getBorrowedBook() {
        return borrowedBook;
    }
    public void borrow(Book book) {
        if (book.isAvailable()) {
            this.borrowedBook = book;
            System.out.println(name + " successfully borrowed \"" + book.getTitle() + "\".");
        } else {
            System.out.println("Borrowing failed for " + name + ": \"" + book.getTitle() + "\" is already borrowed.");
        }
    }
    public void displayBorrowedBook() {
        if (borrowedBook != null) {
            System.out.println(name + " currently has borrowed: \"" + borrowedBook.getTitle() + "\"");
        } else {
            System.out.println(name + " currently has no borrowed books.");
        }
    }
}