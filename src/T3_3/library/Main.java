package T3_3.library;

import T3_3.library.model.Book;
import T3_3.library.model.LibraryMember;
import T3_3.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "978-0547928210");
        Book book2 = new Book("The Two Towers", "J.R.R. Tolkien", "9780618153992");
        Book book3 = new Book("The Return of the King", "J.R.R. Tolkien", "978-0618154005");
        Book book4 = new Book("Dragons of Autumn Twilight", "Margaret Weis and Tracy Hickman", "978-0140087185");
        Book book5 = new Book("The Alchemist", "H.P. Lovecraft", "9788726597004");

        Book[] books = {book1, book2, book3, book4, book5};

        for (Book book : books) {
            library.addBook(book);
        }

        // creating members
        LibraryMember member1 = new LibraryMember("Sneed", 1);
        LibraryMember member2 = new LibraryMember("Goober", 2);
        library.addMember(member1);
        library.addMember(member2);

        // Borrowing books
        library.borrowBook(member1, book1);
        library.borrowBook(member1, book3);
        library.borrowBook(member2, book2);
        System.out.println(member1.getName() + " borrowed");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }
        System.out.println();
        System.out.println(member2.getName() + " borrowed");
        for (Book book : member2.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        // Returning books
        library.returnBook(member1, book1);
        System.out.println();
        System.out.println(member1.getName() + " returned " + book1.getTitle());

        // checking member1 for books remaining
        System.out.println(member1.getName() + " still borrowed");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        // reserving
        library.reserveBook(member1, book2);
        library.reserveBook(member2, book4);
        library.reserveBook(member1, book5);
        System.out.println();
        library.displayReservedBooks(member1);
        System.out.println();
        library.displayReservedBooks(member2);
        System.out.println();

        library.cancelReservation(member1, book5);
        System.out.println();
        library.displayReservedBooks(member1);

    }
}
