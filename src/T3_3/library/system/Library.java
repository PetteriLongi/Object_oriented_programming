package T3_3.library.system;

import T3_3.library.model.Book;
import T3_3.library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void addMember(LibraryMember member) {
        members.add(member);
    }
    public void borrowBook(LibraryMember member, Book book) {
        if (members.contains(member) && books.contains(book) && !book.isReserved()) {
            books.remove(book);
            member.getBorrowedBooks().add(book);
        }
    }
    public void returnBook (LibraryMember member, Book book) {
        if (members.contains(member) && member.getBorrowedBooks().contains(book)) {
            member.getBorrowedBooks().remove(book);
            books.add(book);
        }
    }
    public void reserveBook(LibraryMember member, Book book) {
        if (members.contains(member) && books.contains(book) && !book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (members.contains(member) && book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
