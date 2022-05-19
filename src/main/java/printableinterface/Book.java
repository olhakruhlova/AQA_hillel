package printableinterface;

import java.util.List;

public class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book: " + title + " " + author);
    }

    static void printBooks(List<Printable> printable) {
//        printable.forEach(item -> {
//            if (item instanceof Book) item.print();
//        });
        for (Printable item : printable) {
            if (item instanceof Book) {
                item.print();
            }
        }
    }
}
