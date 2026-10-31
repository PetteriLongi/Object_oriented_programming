package T2_3;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void addReview(String review) {
        reviews.add(review);
    }
    public double getRating() {
        return rating;
    }
    public int getReviewCount() {
        return reviews.size();
    }
}
