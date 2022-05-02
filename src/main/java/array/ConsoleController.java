package array;

import java.util.Scanner;
public class ConsoleController {

    Scanner scanner = new Scanner(System.in);

    void out(String value) {
        System.out.print(value);
    }

    void outln(String value) {
        System.out.println(value);
    }

    int readInt() {
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }

    void printArray(int[] array) {
        for (int x : array) {
            out("[" + x + "]");
        }
        outln("");
    }

    int[] getArrayFromConsole() {
        int[] array;
        out("Size will be - ");
        int size = readInt();
        array = new int[size];
        return fillArray(array);
    }

    int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = readInt();
        }
        return array;
    }
}

