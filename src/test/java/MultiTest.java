import Calc.Calc;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MultiTest {
    private double operand1 = 4;
    private double operand2 = 2;

    @Test
    public void CheckOperationDiv() {
        Calc oper = new Calc();
        double actual= oper.multiply(operand1,operand2);
        double expected = 8;
        assertThat(expected,equalTo(actual));
        System.out.println("умножение отрабатывает корректно");

    }
}