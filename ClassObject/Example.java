package ClassObject;

class Book {
    public String title;
    public String author;
    public int pages;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}

public class Example {
    public static void main(String[] args) {

        Book myBook = new Book("1984", "George Orwell");

        myBook.pages = 328;

        myBook.displayInfo();

    }
}
