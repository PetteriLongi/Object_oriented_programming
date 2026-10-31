package T2_3;

public class LibraryMain {
    public static void main(String[] args) {
    Book book1 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 1954);
    Book book2 = new Book("The Two Towers", "J.R.R. Tolkien", 1954);
    Book book3 = new Book("The Return of the King", "J.R.R. Tolkien", 1955);
    Book book4 = new Book("Dragons of Autumn Twilight", "Margaret Weis and Tracy Hickman", 1984);
    Book book5 = new Book("The Alchemist", "H.P. Lovecraft", 1908);

    Library library = new Library();

    Book[] books = {book1,book2,book3,book4,book5};

    for (Book book : books) {
        library.addBook(book);
    }

    library.displayBooks();
    System.out.println();
    library.findBooksByAuthor("J.R.R. Tolkien");

    // Create user
        User user1 = new User("Sneed", 30);
        User user2 = new User("Goober", 28);

        library.addUser(user1);
        library.addUser(user2);
        System.out.println();
        library.displayUsers();
        User foundUser = library.findUser("Goober");
        System.out.println("Found: " + foundUser.getName());
        library.removeUser("Goober");
        System.out.println();
        library.displayUsers();

        // Borrow and return
        System.out.println();
        user1.borrowBook(library, "The Fellowship of the Ring");
        System.out.println();
        library.displayBooks();
        user1.displayBorrowedBooks();
        System.out.println();
        user1.returnBook(library, "The Fellowship of the Ring");
        System.out.println();
        library.displayBooks();
        user1.displayBorrowedBooks();

    // Availability test
        System.out.println();
        System.out.println("Is The Fellowship of the Ring available? " +
                library.isBookAvailable("The Fellowship of the Ring"));
        System.out.println("Is The Hobbit available? " +
                library.isBookAvailable("The Hobbit"));

    // Review Test
        book1.setRating(5);
        book1.addReview("An excellent fantasy novel!");
        book1.addReview("A must read for everyone.");

        book2.setRating(4.9);
        book2.addReview("A fantastic continuation of the story.");

        book5.setRating(1);
        book5.addReview("Too spooky for me");

        System.out.println();
    // Average rating takes into account books with 0.0 aswell so it lowers the average a lot.
        System.out.println("Average rating: " + library.getAverageBookRating());
        Book mostReviewed = library.getMostReviewedBook();
        if (mostReviewed != null) {
            System.out.println("Most reviewed book: " + mostReviewed.getTitle());
        }
    }
}
