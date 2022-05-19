package calculator;

public class Calculator {

    // Methods for Sum (+)
    int sum(int... values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }

    long sum(long... values) {
        long sum = 0L;
        for (long i : values) {
            sum += i;
        }
        return sum;
    }

    float sum(float... values) {
        float sum = 0.0f;
        for (float i : values) {
            sum += i;
        }
        return sum;
    }

    double sum(double... values) {
        double sum = 0.0;
        for (double i : values) {
            sum += i;
        }
        return sum;
    }

    // Methods for Difference (-)
    int diff (int a,  int b) {
        int diff = a - b;
        return diff;
    }

     long diff (long a,  long b) {
        long diff = a - b;
        return diff;
    }

    float diff (float a,  float b) {
        float diff = a - b;
        return diff;
    }

    double diff (double a,  double b) {
        double diff = a - b;
        return diff;
    }

    // Methods for Product (*)
    int product (int a,  int b) {
        int product = a * b;
        return product;
    }

    long product (long a,  long b) {
        long product = a * b;
        return product;
    }

    float product (float a,  float b) {
        float product = a * b;
        return product;
    }

    double product (double a,  double b) {
        double product = a * b;
        return product;
    }

    // Division Methods (/)
    int number (int a,  int b) {
        int division = a / b;
        return division;
    }

    long number (long a,  long b) {
        long division = a / b;
        return division;
    }

    float number (float a,  float b) {
        float division = a / b;
        return division;
    }

    double number (double a,  double b) {
        double division = a / b;
        return division;
    }
}
