package calculatordemotest;

import calculatordemo.Calculator;
import org.junit.*;

public class CalculatorTest {
    static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
        System.out.println("Тестування розпочалось");
    }
    @Before
    public void setUpMethod(){
        System.out.println("Перед методом");
    }

    @Test
    public void testSum() {
        System.out.println("Тест плюс");
       Assert.assertEquals(4, calculator.calculate("2 + 2"));
    }

    @Test
    public void testMinus() {
        System.out.println("Тест мінус");
        Assert.assertEquals("Калькулятор віднімає не вірно", 2, calculator.calculate("4 - 2"));
    }


    @After
    public void tearDownMethod(){
        System.out.println("Після метода");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Тести закінчились");
    }

}

