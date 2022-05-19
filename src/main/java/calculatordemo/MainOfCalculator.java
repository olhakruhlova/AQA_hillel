package calculatordemo;

public class MainOfCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculate("2 - 2");
        System.out.println(result);
    }
}
