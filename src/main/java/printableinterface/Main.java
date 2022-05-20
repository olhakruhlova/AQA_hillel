package printableinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arge) {

        Book book1 = new Book("Кобзар", "Шевчентко Тарас Григорович");
        Book book2 = new Book("Лісова Пісня", "Леся Українка");
        Magazine magazine1 = new Magazine("Maxim", LocalDate.of(2021, 11, 23));
        Magazine magazine2 = new Magazine("Cosmopolitan", LocalDate.of(2020, 10, 8));


        List<Printable> printableList = new ArrayList<>();
        printableList.add(book1);
        printableList.add(book2);
        printableList.add(magazine1);
        printableList.add(magazine2);
        System.out.println(printableList.size());

        for (Printable item : printableList) {
             item.print();
        }

        System.out.println("\nOnly magazines:");
        Magazine.printMagazine(printableList);

        System.out.println("\nOnly book:");
        Book.printBooks(printableList);
    }
}


