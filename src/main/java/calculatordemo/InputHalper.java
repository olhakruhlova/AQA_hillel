package calculatordemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHalper {
    private Pattern pattern;
    private Matcher matcher;
    private String expression;

    public InputHalper(String expression) {
        this.expression = expression;
        pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
        matcher = pattern.matcher(expression);
        if (!isSringCorrect(expression)) {
            throw new RuntimeException("String isn't correct");
        }
    }
    public int getFirstArgument() {
        pattern = Pattern.compile("^(\\d+)");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());

        //  або цю регулярку замінити на
        // return Integer.parseInt(expression.substring(0, 1)); //якщо ми точно знаємо з яким вводом працюємо
    }

    public int getSecondArgument() {
        pattern = Pattern.compile("(\\d+)$");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }

    public char getOperation() {
        pattern = Pattern.compile("([+-])");
        matcher = pattern.matcher(expression);
        matcher.find();
        return matcher.group().charAt(0);
    }
    //2 + 2
    //2     +2
    ///300 + 300
    public boolean isSringCorrect(String inputString) {
        return matcher.matches();
    }
}
