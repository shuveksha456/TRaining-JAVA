package Task;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("--------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating multiple book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("1984", "George Orwell", 8.99);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 12.50);

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
