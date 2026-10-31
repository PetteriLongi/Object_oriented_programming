package T2_3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", Year: " + book.getPublicationYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by author: " + author);
        for  (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle() +
                        ", Year: " + book.getPublicationYear());
            }
        }
    }
    public void borrowBook(User user, String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                Book book = books.remove(i);
                user.addBorrowedBook(book);
                System.out.println(user.getName() + " Borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not in library: " + title);
    }
    public void returnBook(User user, String title) {
        Book book = user.removeBorrowedBook(title);

        if (book != null) {
            books.add(book);
            System.out.println(user.getName() + " returned: " + title);
        } else {
            System.out.println(user.getName() + " has not borrowed: " + title);
        }
    }
    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    public double getAverageBookRating() {
        double totalRating = 0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        if (books.isEmpty()) {
            return 0;
        }
        return totalRating / books.size();
    }
    public Book getMostReviewedBook() {
        Book mostReviewedBook = null;
        int highestReviewCount = -1;
        for (Book book : books) {
            if (book.getReviewCount() > highestReviewCount) {
                highestReviewCount = book.getReviewCount();
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }
    public void addUser(User user) {
        users.add(user);
    }
    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
    public void removeUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                users.remove(i);
                return;
            }
        }
    }
    public void displayUsers() {
        System.out.println("Users");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}