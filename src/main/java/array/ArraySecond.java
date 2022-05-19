package array;

public class ArraySecond {
    public static void main(String[] args) {

        ConsoleController consoleController = new ConsoleController();

        int[] inputArray = consoleController.getArrayFromConsole();

        consoleController.out("inputArray: ");
        consoleController.printArray(inputArray);

        int resultArraySize = countPositiveNumbers(inputArray);

        int[] resultArray = new int[resultArraySize];
        consoleController.out("resultArray: ");

        fillResultArrayByPositiveNumbers(inputArray, resultArray);

        consoleController.printArray(resultArray);
    }

    static int countPositiveNumbers(int[] inputArray) {
        int resultArraySize = 0;

        for (int x : inputArray) {
            if (x > 0) {
                resultArraySize++;
            }
        }

        return resultArraySize;
    }

    private static void fillResultArrayByPositiveNumbers(int[] inputArray, int[] resultArray) {
        int resultArrayIndex = 0;
        for (int i : inputArray) {
            if (i > 0) {
                resultArray[resultArrayIndex] = i;
                resultArrayIndex++;
            }
        }
    }
}

