class LibraryItem {
    int itemId;
    String title;

    LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    void displayDetails() {
        System.out.println("Item ID   : " + itemId);
        System.out.println("Title     : " + title);
    }
}

class Book extends LibraryItem {
    String author;
    String publisher;

    Book(int itemId, String title, String author, String publisher) {
        super(itemId, title);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Author    : " + author);
        System.out.println("Publisher : " + publisher);
    }
}

class EBook extends Book {
    double fileSize; // in MB

    EBook(int itemId, String title, String author, String publisher, double fileSize) {
        super(itemId, title, author, publisher);
        this.fileSize = fileSize;
    }

    void downloadBook() {
        System.out.println("Downloading \"" + title + "\" (" + fileSize + " MB)... Download complete.");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("File Size : " + fileSize + " MB");
    }
}

public class Main {
    public static void main(String[] args) {
        EBook eb = new EBook(1, "Java Programming", "Herbert Schildt", "McGraw Hill", 12.5);
        eb.displayDetails();
        eb.downloadBook();
    }
}
