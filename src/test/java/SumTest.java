import Calc.Calc;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SumTest {


    @Test
    public void CheckOperationDiv() {
        Calc oper = new Calc();
        double actual= oper.sum();
        double expected = 6;
        assertThat(expected,equalTo(actual));
        System.out.println("сумма отрабатывает корректно");

    }
}