package calculatordemotest;

import calculatorhomework5.CalculatorHomeWork;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorHomeWorkTest {
    static CalculatorHomeWork calculatorHomeWork;

    @BeforeClass
    public static void setUp() {
        calculatorHomeWork = new CalculatorHomeWork();
        System.out.println("Test started");
    }

    @Test
    public void testSum() {
        System.out.println("Sum of digits in the string");
        Assert.assertEquals("Problem with string where are only digits", 8, calculatorHomeWork.sumOfDigit("2 2 4"));
        Assert.assertEquals("Problem with string where are characters", 8, calculatorHomeWork.sumOfDigit("2qwe2%^&4"));
        Assert.assertEquals("Problem with string where isn't digit", 0, calculatorHomeWork.sumOfDigit("qwerty"));
    }

    @AfterClass
    public static void shoutDown() {
        System.out.println("Test finished");
    }
}
