package calculator;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultSumInt = calculator.sum(2, 4, 6, 9);
        System.out.println("Sum of int: " + resultSumInt);

        long resultSumLong = calculator.sum(653673, 77788888, 777778888);
        System.out.println("Sum of long: " + resultSumLong);

        float resultSumFloat = calculator.sum(3.4f, 6.7f, 67.7f);
        System.out.println("Sum of float: " + resultSumFloat);

        double resultSumDouble = calculator.sum(4.27, 3.78, 7.98);
        System.out.println("Sum of double: " + resultSumDouble);
        System.out.println();

        int resultDiffInt = calculator.diff(8, 6);
        System.out.println("Diff of int: " + resultDiffInt);

        long resultDiffLong = calculator.diff(77788888, 653673);
        System.out.println("Diff of long: " + resultDiffLong);

        float resultDiffFloat = calculator.diff(3.4f, 6.7f);
        System.out.println("Diff of float: " + resultDiffFloat);

        double resultDiffDouble = calculator.diff(4.27, 3.78);
        System.out.println("Diff of double: " + resultDiffDouble);
        System.out.println();

        int resultProdInt = calculator.product(8, 6);
        System.out.println("Product of int: " + resultProdInt);

        long resultProdLong = calculator.product(777, 653673);
        System.out.println("Product of long: " + resultProdLong);

        float resultProdFloat = calculator.product(3.4f, 6.7f);
        System.out.println("Product of float: " + resultProdFloat);

        double resultProdDouble = calculator.product(4.27, 3.78);
        System.out.println("Product of double: " + resultProdDouble);
        System.out.println();

        int resultDivisionInt = calculator.number(8, 6);
        System.out.println("Division of int: " + resultDivisionInt);

        long resultDivisionLong = calculator.number(777, 653673);
        System.out.println("Division of long: " + resultDivisionLong);

        float resultDivisionFloat = calculator.number(3.4f, 6.7f);
        System.out.println("Division of float: " + resultDivisionFloat);

        double resultDivisionDouble = calculator.number(4.27, 3.78);
        System.out.println("Division of double: " + resultDivisionDouble);
        System.out.println();
    }
}
