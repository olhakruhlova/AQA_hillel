import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter size: ");

        int size = console.nextInt();
        int[] inputArray = new int[size];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter value: ");
            inputArray[i] = console.nextInt();
        }
        System.out.print("inputArray: ");

        for (int x : inputArray) {
            System.out.print("[" + x + "] ");
        }

        int resultArraySize = 0;
        for (int x : inputArray) {
            if (x > 0) {
                resultArraySize++;
            }
        }

        int[] resultArray = new int[resultArraySize];

        System.out.println();
        System.out.print("resultArray: ");

        int resultArrayIndex = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) {
                resultArray[resultArrayIndex] = inputArray[i];
                System.out.print("[" + resultArray[resultArrayIndex] + "] ");
            }
        }
    }
}