import Calc.Calc;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MinusTest {


    @Test
    public void CheckOperationDiv() {
        Calc oper = new Calc();
        double actual= oper.minus();
        double expected = 2;
        assertThat(expected,equalTo(actual));
        System.out.println("вычитание отрабатывает корректно");

    }
}