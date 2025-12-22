package week7;

public class Book{
    String title;
    String author;
    String ISBN;
    int publicationYear;
    String genre;
    boolean availabilityStatus;
    
    Book(String title, String author, String ISBN, int publicationYear, String genre, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + availabilityStatus);
        System.out.println("----------------------");
    
    }
    
    public static void main(String[] args) {
        // Create book objects
        Book b1 = new Book("Asahamati", "B.P. Koirala", "ISBN001", 1970, "Fiction", true);
        Book b2 = new Book("Muna Madan", "Laxmi Prasad Devkota", "ISBN002", 1935, "Nepali", false);
        Book b3 = new Book("Palpasa Café", "Narayan Wagle", "ISBN003", 2005, "Fiction", true);
    
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
    
    
}