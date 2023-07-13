package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exeption.ZeroDividerException;
import pro.sky.calculator.service.CalculatorService;
import pro.sky.calculator.service.CalculatorServiceImpl;

public class CalculatorServiceImplTest {
    private CalculatorService calculatorService = new CalculatorServiceImpl();
    @Test
    public void testDoNothing() {

    }
@Test
    public void shouldReturn5WhenSumOfAnd3() {
    int result = calculatorService.plus(2,3);
    Assertions.assertEquals(5, result);

    }
@Test
    public void shouldThrowExceptionWhenDivideBy0() {
        Assertions.assertThrows(Exception.class, () ->calculatorService.divide(10, 0));
    }
}