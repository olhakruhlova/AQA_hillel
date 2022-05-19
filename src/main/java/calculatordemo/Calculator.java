package calculatordemo;

public class Calculator {
    private  int a;
    private  int b;
    private char operation;

     //"2 + 2" return 4
    public int calculate(String expression) {
        InputHalper inputHalper = new InputHalper(expression);

        a = inputHalper.getFirstArgument();
        b = inputHalper.getSecondArgument();
        operation = inputHalper.getOperation();

        if (operation == '+') {
            return a + b;
        }
        else {
            return a - b;
        }
    }
}


// 55.12
//1.30
//2.01


