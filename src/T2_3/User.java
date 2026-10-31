package T2_3;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void borrowBook(Library library, String title) {
        library.borrowBook(this, title);
    }
    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }
    public Book removeBorrowedBook(String title){
        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i).getTitle().equals(title)) {
                return borrowedBooks.remove(i);
            }
        }
        return null;
    }
    public void returnBook(Library library, String title) {
        library.returnBook(this, title);
    }
    public void displayBorrowedBooks() {
        System.out.println(name + " has borrowed these books: ");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }
}
