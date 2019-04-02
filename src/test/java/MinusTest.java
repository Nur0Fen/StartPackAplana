import Calc.Calc;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MinusTest {
    private double operand1 = 6;
    private double operand2 = 4;

    @Test
    public void CheckOperationDiv() {
        Calc oper = new Calc();
        double actual= oper.minus(operand1,operand2);
        double expected = 2;
        assertThat(expected,equalTo(actual));
        System.out.println("вычитание отрабатывает корректно");

    }
}