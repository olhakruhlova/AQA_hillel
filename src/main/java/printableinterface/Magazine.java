package printableinterface;

import java.time.LocalDate;
import java.util.List;

public class Magazine implements Printable{
    private String title;
    private LocalDate data;

    public Magazine(String title, LocalDate data) {
        this.title = title;
        this.data = data;
    }

    public void print() {
        System.out.println("Magazine: " + title + " " + data);
    }
    static void printMagazine(List<Printable> printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }
}
