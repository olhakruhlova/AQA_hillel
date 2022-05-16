package calculatorhomework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorHomeWork {
    private Pattern pattern;
    private Matcher matcher;
    private String expression;

    public int sumOfDigit(String expression) {
        this.expression = expression;
        pattern = Pattern.compile("\\d+");
        matcher = pattern.matcher(expression);

        int sum = 0;
        while (matcher.find()) {
            sum = sum + Integer.parseInt(matcher.group());
        }
        return sum;
    }
}
